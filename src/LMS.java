import java.util.Scanner;
public class LMS {

    static Learner[] learners = new Learner[5];
    static void main(String[] args)
    {
        int menuSelected = 0;
        Scanner scan = new Scanner(System.in);
        int index=0;
        while(menuSelected >=0)
        {
            switch(menuSelected)
            {
                case 0:
                    loadMenu();
                    System.out.println("Select menu item:");
                    menuSelected = scan.nextInt();
                    break;
                case 1:
                    Learner l = new Learner();
                    System.out.println("Enter name");
                    l.Name = scan.next();
                    System.out.println("Enter age");
                    l.age = scan.nextInt();
                    System.out.println("Enter XP");
                    l.Xp= scan.nextFloat();
                    if(index<=10) {
                        learners[index] = l;
                    }
                    else {
                        System.out.println("Storage full");
                    }
                    index++;

                    System.out.println(learners);
                    System.out.println("Learner added successfully");
                    menuSelected = 0;
                    break;
                case 2:
                    System.out.println("---Learner list---");
                    for(Learner L: learners)
                    {
                        if(L !=null)
                            System.out.println("Name:"+L.Name+" | Age:"+L.age+" | XP:"+L.Xp);
                    }
                    System.out.println("Select menu item:");
                    menuSelected = scan.nextInt();
                    break;
                case 3:
                    float allXP =0;
                    int count=0;
                    for(Learner L: learners)
                    {
                        if(L !=null)
                        {
                            allXP=allXP+L.Xp;
                            count++;
                        }

                    }
                    float avgXP=allXP/count;
                    System.out.println("Average XP: "+avgXP);
                    System.out.println("Select menu item:");
                    menuSelected = scan.nextInt();
                    break;
                case 4:
                    menuSelected=-1;
                    System.out.println("Good bye");
            }
        }

    }

    public static void utilMethod()
    {

    }
    public static void loadMenu()
    {
        System.out.println("===== Airtribe Learner Manager ====");
        System.out.println("1.Add a Learner");
        System.out.println("2.Display All Learners");
        System.out.println("3.Calculate Average XP");
        System.out.println("4.Exit");
    }
}
