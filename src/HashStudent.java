public class HashStudent {

    int grade;  // 年级
    int cls;    // 班级
    String firtName;
    String lastName;

    HashStudent(int grade, int cls, String firtName, String lastName) {
        this.grade = grade;
        this.cls = cls;
        this.firtName = firtName;
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {

        int B = 31;
        int hash = 0;
        hash = hash * B + grade;
        hash = hash * B + cls;
        hash = hash * B + firtName.toLowerCase().hashCode();
        hash = hash * B + lastName.toLowerCase().hashCode();

        return hash;
    }

    // 判断两个对象是否相等
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        HashStudent another = (HashStudent)o;
        return this.grade == another.grade &&
                this.cls == another.cls &&
                this.firtName.toLowerCase().equals(another.firtName.toLowerCase()) &&
                this.lastName.toLowerCase().equals(another.lastName.toLowerCase());
    }
}
