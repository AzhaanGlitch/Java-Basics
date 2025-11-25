class this_key{
    int rollno;
    String name;
    float fee;

    this_key(int rollno, String name, float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    void display(){
        System.out.println(rollno + " " + name + " " + fee);
    }
}

class test{
    public static void main(String[] args) {
        this_key k1 = new this_key(101, "azhaan", 5000f);
        this_key k2 = new this_key(102, "ekjot", 4000f);
        k1.display();
        k2.display();
    }
}