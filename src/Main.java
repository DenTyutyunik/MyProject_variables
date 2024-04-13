public class Main {
    public static void main(String[] args) {
        // Task 1
        // Work with variables dog, cat and paper
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        // Output to console
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Task 2
        // Change variables
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        // Output to console
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Task 3
        // Change variables
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        // Output to console
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Task 4
        // Work with variable friend
        var friend = 19;
        // Output to console
        System.out.println(friend);
        // Change variable
        friend = friend + 2;
        // Output to console
        System.out.println(friend);
        // Change variable
        friend = friend / 7;
        // Output to console
        System.out.println(friend);

        // Task 5
        // Work with variable frog
        var frog = 3.5;
        // Output to console
        System.out.println(frog);
        // Change variable
        frog = frog * 10;
        // Output to console
        System.out.println(frog);
        // Change variable
        frog = frog / 3.5;
        // Output to console
        System.out.println(frog);
        // Change variable
        frog = frog + 4;
        // Output to console
        System.out.println(frog);

        // Task 6
        // Work with weight of boxers
        var BoxerFirstWeight = 78.2;
        var BoxerSecondWeight = 82.7;
        // Output Total weight to console
        System.out.println(BoxerFirstWeight + BoxerSecondWeight);
        // Output Difference weight to console
        System.out.println(BoxerSecondWeight - BoxerFirstWeight);

        // Task 7
        // Remainder of division
        var weight1 = 3;
        var weight2 = 14;
        // Output to console
        System.out.println(weight2 % weight1);

        // Task 8
        // Amount of employees and working hours
        var workingHours = 640;
        var employeeWorkingHours = 8;
        var employeeAmount = workingHours / employeeWorkingHours;
        var employeeAmountAdd94 = employeeAmount + 94;
        // Output to console
        System.out.println("Всего работников в компании - " + employeeAmount + " человек");
        // Output to console
        System.out.println("Если в компании работает - " + employeeAmountAdd94 + " человек, то всего " + employeeAmountAdd94 * employeeWorkingHours + " часов работы может быть поделено между сотрудниками");
    }
}