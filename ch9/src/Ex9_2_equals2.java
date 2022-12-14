class Person {
    long id;

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person))
            return false;
        Person p = (Person)obj;

        return this.id == p.id;
    }

    Person(long id) {
        this.id = id;
    }
}

class Ex9_2_equals2 {
    public static void main(String[] args) {
        Person p1 = new Person(80110811111222L);
        Person p2 = new Person(80110811111222L);

        if(p1.equals(p2))
            System.out.println("p1과 p2같음");
        else
            System.out.println("p1과 p2다름");
    }
}


