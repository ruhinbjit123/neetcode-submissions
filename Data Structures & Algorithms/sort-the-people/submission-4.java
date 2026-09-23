class Solution {
    public String[] sortPeople(String[] people, int[] height) {
        String[] result = new String[people.length];

        List<People> list = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            People p1 = new People();
            p1.name = people[i];
            p1.height = height[i];
            list.add(p1);
        }

        Arrays.sort(height);
        int index=0;
        for (int i = height.length -1; i >=0; i--) {
            for (People value : list) {
                if (height[i] == value.height) {
                    result[index++] = value.name;
                }
            }
        }

        return result;
    }
}

public class People {
    String name;
    int height;
    public People() {}
    public People(String name, int height) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}