package br.ufabc.ryou.models;

import java.sql.Date;

/**
 *
 * @author Notebook Asus
 */
public class Menu {
    
    private int id_menu;
    private Date stanrting_time;
    private Date ending_date;
    private Option main_dish;
    private Option no_meat_dish;
    private Option salad_1;
    private Option salad_2;
    private Option salad_3;
    private Option rice_1;
    private Option rice_2;
    private Option bean;
    private Option juice_1;
    private Option juice_2;
    private Option no_sugar_juice;
    private Option desser;
    private Option fruit;
    private Option garrison;

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public Date getStanrting_time() {
        return stanrting_time;
    }

    public void setStanrting_time(Date stanrting_time) {
        this.stanrting_time = stanrting_time;
    }

    public Date getEnding_date() {
        return ending_date;
    }

    public void setEnding_date(Date ending_date) {
        this.ending_date = ending_date;
    }

    public Option getMain_dish() {
        return main_dish;
    }

    public void setMain_dish(Option main_dish) {
        this.main_dish = main_dish;
    }

    public Option getNo_meat_dish() {
        return no_meat_dish;
    }

    public void setNo_meat_dish(Option no_meat_dish) {
        this.no_meat_dish = no_meat_dish;
    }

    public Option getSalad_1() {
        return salad_1;
    }

    public void setSalad_1(Option salad_1) {
        this.salad_1 = salad_1;
    }

    public Option getSalad_2() {
        return salad_2;
    }

    public void setSalad_2(Option salad_2) {
        this.salad_2 = salad_2;
    }

    public Option getSalad_3() {
        return salad_3;
    }

    public void setSalad_3(Option salad_3) {
        this.salad_3 = salad_3;
    }

    public Option getRice_1() {
        return rice_1;
    }

    public void setRice_1(Option rice_1) {
        this.rice_1 = rice_1;
    }

    public Option getRice_2() {
        return rice_2;
    }

    public void setRice_2(Option rice_2) {
        this.rice_2 = rice_2;
    }

    public Option getBean() {
        return bean;
    }

    public void setBean(Option bean) {
        this.bean = bean;
    }

    public Option getJuice_1() {
        return juice_1;
    }

    public void setJuice_1(Option juice_1) {
        this.juice_1 = juice_1;
    }

    public Option getJuice_2() {
        return juice_2;
    }

    public void setJuice_2(Option juice_2) {
        this.juice_2 = juice_2;
    }

    public Option getNo_sugar_juice() {
        return no_sugar_juice;
    }

    public void setNo_sugar_juice(Option no_sugar_juice) {
        this.no_sugar_juice = no_sugar_juice;
    }

    public Option getDesser() {
        return desser;
    }

    public void setDesser(Option desser) {
        this.desser = desser;
    }

    public Option getFruit() {
        return fruit;
    }

    public void setFruit(Option fruit) {
        this.fruit = fruit;
    }

    public Option getGarrison() {
        return garrison;
    }

    public void setGarrison(Option garrison) {
        this.garrison = garrison;
    }

    
}
