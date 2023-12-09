package com.study.base.test;

public class a {
    static class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Animal: " + name;
        }
    }

    static class Dog extends Animal {
        private String breed;

        public Dog(String name, String breed) {
            super(name);
            this.breed = breed;
        }

        @Override
        public String toString() {
            return "Dog: " + getName() + ", Breed: " + breed;
        }

        private String getName() {
            return super.toString().substring(8); // 获取Animal类中的名字
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Leo");
        System.out.println(animal.toString()); // 输出：Animal: Leo

        Dog dog = new Dog("Buddy", "Labrador");
        System.out.println(dog.toString()); //
    }
}
