package com.exemple.tp;

import java.util.List;

public class Test {
	public static void main(String[] args) {
        TaskManager mgr = new TaskManager();

        mgr.addTasj("Écrire la doc", 2);
        mgr.addTasj("Corriger les bugs", 1);
        mgr.addTasj("Préparer démo", 3);
        mgr.addTasj("Envoyer emails", 4);
       
        System.out.println("=== Toutes les tâches ===");
        mgr.listTasks().forEach(System.out::println);
        System.out.println();


        System.out.println("=== Trier par priorité ===");
        mgr.sortByPriority();
        mgr.listTasks().forEach(System.out::println);
        System.out.println();

        
        System.out.println("=== Tâche #2 en cours ===");
        mgr.updateStatus(2, Status.IN_POROGRESS);
        mgr.listTasks().forEach(System.out::println);
        System.out.println();

        
        System.out.println("=== Filtrer PENDING ===");
        List<Task> pending = mgr.filterByStatus(Status.PENDING);
        pending.forEach(System.out::println);
        System.out.println();

       
        System.out.println("=== Supprimer tâche #1 ===");
        mgr.removeTask(1);
        mgr.listTasks().forEach(System.out::println);
    }
}

