package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );
        System.out.println("Введіть ключ");
        String a = input.next();
        if (a.equals("pro")){
            ProDocumentWorker p = new ProDocumentWorker() ;
            p.openDocument() ;
            p.editDocument() ;
            p.saveDocument() ;
        } else if (a.equals("exp")){
            ExpertDocumentWorker e = new ExpertDocumentWorker() ;
            e.openDocument() ;
            e.editDocument() ;
            e.saveDocument() ;
         } else {
            DocumentWorker d = new DocumentWorker() ;
            d.openDocument() ;
            d.editDocument() ;
            d.saveDocument() ;

        }
    }
}
