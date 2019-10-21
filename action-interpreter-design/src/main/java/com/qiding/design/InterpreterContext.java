package com.qiding.design;

/*文法规则
  <expression> ::= <city>的<person>
  <city> ::= 韶关|广州
  <person> ::= 老人|妇女|儿童
*/

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface AbstractExpression{
   public  boolean  interpret(String info);
}

class CityExpression implements AbstractExpression{
    private Set<String> citySet;
    public CityExpression(String []citys) {
        citySet=Stream.of(citys).collect(Collectors.toSet());
    }

    @Override
    public boolean interpret(String info) {
        return citySet.contains(info);
    }
}

class PersonExpression implements AbstractExpression{
    private Set<String> personSet;
    public PersonExpression(String []persons) {
        personSet=Stream.of(persons).collect(Collectors.toSet());
    }

    @Override
    public boolean interpret(String info) {
        return personSet.contains(info);
    }
}

class AndExpression implements AbstractExpression{

    private String split="的";
    private AbstractExpression person;
    private AbstractExpression city;

    public AndExpression(AbstractExpression city, AbstractExpression person) {
        this.person = person;
        this.city = city;
    }

    @Override
    public boolean interpret(String info) {
        String []expres= info.split(split);
        return city.interpret(expres[0])&person.interpret(expres[1]);
    }
}


public class InterpreterContext {
    private String[] citys={"韶关","广州"};
    private String[] persons={"老人","妇女","儿童"};
    private AbstractExpression cityPerson;

    public InterpreterContext() {
        AbstractExpression  cityExpression=new CityExpression(citys);
        AbstractExpression  personExpression=new PersonExpression(persons);
        this.cityPerson = new AndExpression(cityExpression,personExpression);
    }
    public  void freeRide(String info){
        if(cityPerson.interpret(info)){
            System.out.println("你是免费人员"+info+",乘车免费");
        }else {
            System.out.println(info+"您不是免费人员，本次乘车扣费2元！");
        }
    }
}
