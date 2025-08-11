interface Sports {
    float SportWt = 6.0f;

    void putwt();
}

class Information {
    int RollNumber;

    void getNumber(int n) {
        RollNumber = n;
    }

    void putNumber() {
        System.out.println("Roll no.: " + RollNumber);
    }
}

class Test extends Information {
    float Part1, Part2;

    void getMarks(float m1, float m2) {
        Part1 = m1;
        Part2 = m2;
    }

    void putMarks() {
        System.out.println("Marks Obtained");
        System.out.println("Mark 1 :" + Part1);
        System.out.println("Mark 1 :" + Part2);
    }
}

class Results extends Test implements Sports {
    float Total;

    public void putwt() {
        System.out.println("Sports WT =" + SportWt);
    }

    void display() {
        Total = Part1 + Part2 + SportWt;
        putNumber();
        putMarks();
        putwt();
        System.out.println("Total Score =" + Total);
    }
}

public class Stude {
    public static void main(String[] args) {
        Results student1 = new Results();
        student1.getNumber(12234);
        student1.getMarks(89.0f, 90.99f);
        student1.display();
    }
}