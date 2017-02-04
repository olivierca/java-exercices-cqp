package exercices;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {

        // class édudiant
        class Student
        {

            protected String sNom;
            protected String sPrenom;
            protected LocalDate dDate;
            protected int iAge;

            // constructeur avec les caractéristique de édudiant
            public Student(String nom, String prenom, LocalDate date, int age )
            {
                sNom = nom;
                sPrenom  = prenom;
                dDate = date;
                iAge = age;
            }

            // retourne les infos de l'édudiant
            @Override
            public String toString()
            {
                return  "Edudiant : \r\n" +
                        "Nom    : "+sNom+"\r\n" +
                        "Prénom : "+sPrenom+"\r\n" +
                        "Née le : "+dDate+"\r\n" +
                        "Agé de : "+iAge+"\r\n";
            }
        }

        // class école
        class School
        {
            private String sNom;        // nom de l'école
            public ArrayList lStudent;  // liste des étudiant

            public School (String nom)
            {
                sNom = nom;
                lStudent = new ArrayList(); // création de la liste des étudiant
            }

            @Override
            public String toString()        // retourne le nom de l'école
            {
                return "Ecole : "+sNom+"\r\n";
            }
        }

        // class édudiant diplômé
        class Graduate extends Student
        {
            public int iGrade;     // (5:bac+5, 4:bac+4, 3:bac+3, 2:bac+2, 1:bac)

            public Graduate(String nom, String prenom, LocalDate date, int age, int grade)
            {
                super(nom, prenom, date, age);
                iGrade = grade;
            }

            // retourne la différence de niveau avec un autre étudiant
            public String equals(Graduate student)
            {
                String grade;
                Graduate St;

                // comparaison
                if(iGrade == student.iGrade) grade = sPrenom+" et "+student.sPrenom+" ont le même niveau";
                else if(iGrade > student.iGrade) grade = sPrenom+" à un niveau supérieur à "+student.sPrenom;
                else grade = sPrenom+" à un niveau inférieur à "+student.sPrenom;

                return grade;
            }

            // retourne les infos de l'édudiant
            @Override
            public String toString()
            {
                return  "Edudiant : \r\n" +
                        "Nom    : "+sNom+"\r\n" +
                        "Prénom : "+sPrenom+"\r\n" +
                        "Née le : "+dDate+"\r\n" +
                        "Agé de : "+iAge+"\r\n" +
                        "Diplôme: Bac+"+iGrade+"\r\n";
            }

            public String GetPrenom()
            {
                return sPrenom;
            }
        }

        //------------------------------------------------------------------------------------------------------------
        //                  Execercice 1

        // creation de l'école Simplon
        School InfoJava = new School("Simplon");

        System.out.println("exercice 1 :");
        System.out.println("----------------------------------------");

        /* ajouter les édudiant de l'école
            Stéphanie; Durand; 12/11/1980; 37
            Mamadou; Fort; 13/09/1992;25
            Florence; Lune; 05/04/2001;16
            Loic; Martin; 07/07/1998;19
         */
        InfoJava.lStudent.add(new Student("Durant","Stéphanie",LocalDate.of(1980, Month.DECEMBER, 11),37));
        InfoJava.lStudent.add(new Student("Fort","Mamadou",LocalDate.of(1992, Month.NOVEMBER, 13),25));
        InfoJava.lStudent.add(new Student("Lune","Florence",LocalDate.of(2001, Month.APRIL, 05),16));
        InfoJava.lStudent.add(new Student("Martin","Loic",LocalDate.of(1998, Month.JULY, 07),19));

        // afficher les infos de l'école
        System.out.println(InfoJava);            // nom de l'école

        for(int i=0; i<InfoJava.lStudent.size(); i++)       // liste les étudiants
        {
            System.out.println(InfoJava.lStudent.get(i));        // affiche les infos des étudiants
        }

        //------------------------------------------------------------------------------------------------------------
        //                  Execercice 2
        System.out.println("exercice 2 :");
        System.out.println("----------------------------------------");

        /* ajouter les édudiant diplomés de l'école
            Prénom; Nom; Date de naissance; âge; diplome
            Drake; Foudre; 11/11/1990; 27; 2
            Solange; Feu; 12/12/1990; 27; 5
            Johnny; Lumière; 01/10/1990; 27; 3
        */
        InfoJava.lStudent.add(new Graduate("Foudre","Drake",LocalDate.of(1990, Month.NOVEMBER, 11),27,2));
        InfoJava.lStudent.add(new Graduate("Feu","Solange",LocalDate.of(1990, Month.DECEMBER, 12),27,5));
        InfoJava.lStudent.add(new Graduate("Lumière","Johnny",LocalDate.of(1990, Month.OCTOBER, 01),27,3));

        for(int i=0; i<InfoJava.lStudent.size(); i++)                       // liste les étudiant
        {
            System.out.println(InfoJava.lStudent.get(i));        // affiche les infos des étudiants
        }

        // Afficher la diférrence de niveau entre les diplômés (Johnny et Solange)
        // (a revoir)
        Graduate St;
        Graduate student1=null;
        Graduate student2=null;
        for(int i=0; i<InfoJava.lStudent.size(); i++)           // liste les étudiants
        {
            if( InfoJava.lStudent.get(i) instanceof Graduate )  // recherche des 2 diplômés
            {
                St = (Graduate) InfoJava.lStudent.get(i);
                if(St.GetPrenom()=="Johnny")   student1 = St;
                if(St.GetPrenom()=="Solange")  student2 = St;
            }
            if(student1!=null && student2!=null)                // les 2 diplômés sont trouvés
            {
                System.out.println(student1.equals(student2));  // affiche leur différence de niveau
                break;
            }
        }
    }

}
