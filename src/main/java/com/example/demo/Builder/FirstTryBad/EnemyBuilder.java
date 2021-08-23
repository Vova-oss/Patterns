package com.example.demo.Builder.FirstTryBad;

public class EnemyBuilder extends Builder {


    @Override
    public void setName() {
        user.setName("Worst");
    }

    @Override
    public void setSurname() {
        user.setSurname("Enemy");
    }

    @Override
    public void setAge() {
        user.setAge(19);
    }
}
