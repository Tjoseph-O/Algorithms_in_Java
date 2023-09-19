package chapter16;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Example1 {
    public static void main(String[] args) {
        Comparator<Candidate> comparator = (firstCandidate, secondCandidate)->
            firstCandidate.getParty().compareTo(secondCandidate.getParty());

        Queue<Candidate> candidates = new PriorityQueue<>(comparator);
//        Queue<Candidate> candidates = new ArrayBlockingQueue<>(5);

        candidates.offer(new Candidate("Asiwaju", "APC"));
        candidates.offer(new Candidate("Asiwaju", "APC"));
        candidates.offer(new Candidate("Chimezie", "OPC"));
        candidates.offer(new Candidate("Sultan Yungidu", "APC++"));
        candidates.offer(new Candidate("Peter", "LP"));
        candidates.offer(new Candidate("Atiku", "PDP"));



        System.out.println("Before :: "+ candidates);

        System.out.println(candidates.poll());

        System.out.println("After::"+ candidates);


    }
}
