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

    }
}
