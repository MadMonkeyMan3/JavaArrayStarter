public class ArrayRunner
{
    public static void main(String[] args)
    {
        Student me = new Student("Mr. Howe","December","blue");
        System.out.println(me);

        Student[] myclass = new Student[12];
        Student studentA = new Student("Isabelle", "April","pink");
        myclass[2] = studentA;
        Student studentB = new Student("Lydia", "October", "purple");
        myclass[0] = studentB;
        /*
        System.out.println(myclass[2]);
        System.out.println(myclass[0]);
        */
        for (int i = 0; i<4; i++)
        {
            System.out.println(myclass[i]);
        }

        String[] names = {"Michael", "Brian", "Duncan", "Bennett", "Martin",
                "Jessica","Lexy","Zoe","Jimmy","Sanjit", "Andrew", "Will"};

        System.out.println("There are " + names.length + "names on the list");

        String[] months = {"February","October","March","September", "July",
                "February","November","December","August","May",
                "September", "December"};

        String[] colors = {"Green","Fuscia", "Purple", "Turquoise", "Cyan", "Purple", "Pink", "Indigo", "Green", "Blue", "green", "Space"};

        for(int i = 0; i<12; i++)
        {
            myclass[i] = new Student(names[i], months [i], colors[i]);
        }


        System.out.println("Print out the other students!");

        for(Student s: myclass)
        {
            if (s.getName().equals("Michael"))
            {
                System.out.print("****");
            }
            System.out.println(s);
        }

    }
}
