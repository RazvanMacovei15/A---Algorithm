package razvan.astaralgorithm.Domain;

import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import razvan.astaralgorithm.HelperClasses.Creator;

import java.util.Random;

public class MyCell {
    // GUI

    private VBox vbox;
    // Position
    private int row;
    private int col;
    // Obstacle
    private boolean isObstacle;

    // A* algorithm
    private int parent_i;
    private int parent_j;
    private double f;
    private double g;
    private double h;

    // Constructor
    public MyCell(int row, int col) {
        // GUI
        this.isObstacle = generateRandomBoolean();
        this.vbox = createVbox();

        this.row = row;
        this.col = col;

        // A* algorithm
        this.parent_i = -1;
        this.parent_j = -1;
        this.f = Double.POSITIVE_INFINITY;
        this.g = Double.POSITIVE_INFINITY;
        this.h = Double.POSITIVE_INFINITY;
    }

    public boolean generateRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    private VBox createVbox(){
        VBox vbox = new VBox();
        if(!isObstacle()){
            vbox.setStyle("-fx-background-color: " + Creator.toHex(Color.DARKGREEN) + ";");
        }
        else{
            vbox.setStyle("-fx-background-color: " + Creator.toHex(Color.LIGHTBLUE) + ";");
        }
        return vbox;
    }

    // Getters and setters
    public VBox getVbox() {
        return vbox;
    }

    public void setVbox(VBox vbox) {
        this.vbox = vbox;
    }

    public boolean isObstacle() {
        return isObstacle;
    }

    public void setObstacle(boolean isObstacle) {
        this.isObstacle = isObstacle;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getParent_i() {
        return parent_i;
    }

    public void setParent_i(int parent_i) {
        this.parent_i = parent_i;
    }

    public int getParent_j() {
        return parent_j;
    }

    public void setParent_j(int parent_j) {
        this.parent_j = parent_j;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "MyCell{" +
                "row=" + row +
                ", col=" + col +
                ", isObstacle=" + isObstacle +
                '}';
    }
}
