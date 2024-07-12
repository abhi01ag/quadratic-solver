package com.example.quadraticequationsolver;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.quadraticequationsolver.databinding.ActivityMainBinding;

public class Myequation extends BaseObservable {

    String a;
    String b;
    String c;
    ActivityMainBinding binding;

    public Myequation(ActivityMainBinding binding) {
        this.binding = binding;
    }

    public Myequation() {
    }

    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void solveEquation(View view){

        int a = Integer.parseInt( getA() );
        int b = Integer.parseInt( getB() );
        int c = Integer.parseInt( getC() );

        double discriminate = b*b - 4*a*c;

        double x1,x2;

        if(discriminate>0){
            x1 = (-b + Math.sqrt( discriminate ))/(2*a);
            x2 = (-b - Math.sqrt( discriminate ))/(2*a);

            binding.textView2.setText("X1= "+x1+"\n"+" X2="+x2);
        }
        else if(discriminate<0){
            binding.textView2.setText("No real solution ");
        }else{
            x1 = -b/(2*a);

            binding.textView2.setText("X="+x1);
        }




    }
}
