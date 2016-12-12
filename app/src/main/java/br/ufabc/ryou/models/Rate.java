package br.ufabc.ryou.models;

/**
 *
 * @author Notebook Asus
 */
public class Rate {
    
    private int id_rate;
    private String timestamp;
    private Menu menu;
    private User user;
    private float main_dish;
    private float no_meat_dish;
    private float salad_1;
    private float salad_2;
    private float salad_3;
    private float rice_1;
    private float rice_2;
    private float bean;
    private float juice_1;
    private float juice_2;
    private float no_sugar_juice;
    private float desser;
    private float fruit;
    private float garrison;

    public int getId_rate() {
        return id_rate;
    }

    public void setId_rate(int id_rate) {
        this.id_rate = id_rate;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public float getMain_dish() {
        return main_dish;
    }

    public void setMain_dish(float main_dish) {
        this.main_dish = main_dish;
    }

    public float getNo_meat_dish() {
        return no_meat_dish;
    }

    public void setNo_meat_dish(float no_meat_dish) {
        this.no_meat_dish = no_meat_dish;
    }

    public float getSalad_1() {
        return salad_1;
    }

    public void setSalad_1(float salad_1) {
        this.salad_1 = salad_1;
    }

    public float getSalad_2() {
        return salad_2;
    }

    public void setSalad_2(float salad_2) {
        this.salad_2 = salad_2;
    }

    public float getSalad_3() {
        return salad_3;
    }

    public void setSalad_3(float salad_3) {
        this.salad_3 = salad_3;
    }

    public float getRice_1() {
        return rice_1;
    }

    public void setRice_1(float rice_1) {
        this.rice_1 = rice_1;
    }

    public float getRice_2() {
        return rice_2;
    }

    public void setRice_2(float rice_2) {
        this.rice_2 = rice_2;
    }

    public float getBean() {
        return bean;
    }

    public void setBean(float bean) {
        this.bean = bean;
    }

    public float getJuice_1() {
        return juice_1;
    }

    public void setJuice_1(float juice_1) {
        this.juice_1 = juice_1;
    }

    public float getJuice_2() {
        return juice_2;
    }

    public void setJuice_2(float juice_2) {
        this.juice_2 = juice_2;
    }

    public float getNo_sugar_juice() {
        return no_sugar_juice;
    }

    public void setNo_sugar_juice(float no_sugar_juice) {
        this.no_sugar_juice = no_sugar_juice;
    }

    public float getDesser() {
        return desser;
    }

    public void setDesser(float desser) {
        this.desser = desser;
    }

    public float getFruit() {
        return fruit;
    }

    public void setFruit(float fruit) {
        this.fruit = fruit;
    }

    public float getGarrison() {
        return garrison;
    }

    public void setGarrison(float garrison) {
        this.garrison = garrison;
    }

    
}
