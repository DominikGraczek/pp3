public class Person {
    String name;
    float weight;
    float height;
    float BMI;

    Person(String name) {
        this.name = name;
    }

    Person(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    void setWeightAndHeight(int weight, int height) {
        this.height = height;
        this.weight = weight;
    }

    float calculateBMI() {
        BMI = weight / (height / 100 * height / 100);
        return BMI;
    }

    String displayRecord() {
        return name + weight + height + BMI;
    }
}
