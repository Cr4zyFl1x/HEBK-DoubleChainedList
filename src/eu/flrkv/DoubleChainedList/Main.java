package eu.flrkv.DoubleChainedList;

public class Main {

    public static void main(String[] args) {
        List l = new List();
        List l2 = new List();

        // 1st List persons
        Person p = new Person("Cornelius Wiedau", 18);
        l.appendArray(new Person[] {
                new Person("Anton Sachankow", 17),
                new Person("Jost Vanheiden", 17),
                new Person("Titus Ellermann", 17),
                new Person("Elijah Löbbering", 17),
                p
        });

        // 2nd List persons
        l2.appendArray(new Person[] {
                new Person("Maximilian Lückerath", 17),
                new Person("Helder Jr. Dique", 17),
                new Person("Kay Jersch", 18)
        });


        // Actions
            l.insert(new Person("Kevin Haffner", 17));

            l.concat(l2);

            l.toLast();

            System.out.println(l.getCurrent().getBefore().getContent().getName());

        // Print list, first, last & current
        l.printAll();
        System.out.println();
        System.out.println("First: " + l.getFirst().getContent().getName());
        System.out.println("Last: " + l.getLast().getContent().getName());
        System.out.println("Current: " + ((l.hasAccess()) ? l.getCurrent().getContent().getName() : null));
    }
}
