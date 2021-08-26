package com.example.demo.structural_patterns.Bridge;

import com.example.demo.structural_patterns.Bridge.FirstAttr.CppDeveloper;
import com.example.demo.structural_patterns.Bridge.FirstAttr.JavaDeveloper;
import com.example.demo.structural_patterns.Bridge.SecondAttr.BankSystem;
import com.example.demo.structural_patterns.Bridge.SecondAttr.CompanySystem;
import com.example.demo.structural_patterns.Bridge.SecondAttr.Program;

public class Client {
    public static void main(String[] args) {
        Program program = new BankSystem(new JavaDeveloper());
        program.developProgram();

        program = new BankSystem(new CppDeveloper());
        program.developProgram();

        program = new CompanySystem(new JavaDeveloper());
        program.developProgram();

        program = new CompanySystem(new CppDeveloper());
        program.developProgram();
    }
}
