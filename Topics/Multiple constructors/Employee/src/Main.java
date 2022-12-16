class Employee {
/*Here's a class named Employee with three fields: name, salary, address.

Add three constructors to the class:

the first one is the no-argument constructor, it should initialize string fields with the value "unknown", the salary is 0;
the second one takes name and salary, and then initializes the corresponding fields, the address is "unknown";
the third one takes name, salary, address and initializes all fields.*/
    String name;
    int salary;
    String address;

    public Employee() {
        this.name = "unknown";
        this.salary = 0;
        this.address = "unknown";
    }

    public Employee(String name, int salary) {
        this.address = "unknown";
        this.salary = salary;
        this.name = name;
    }

    public Employee(String name, int salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }


}