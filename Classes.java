package xxx;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Deque;

class Project
{
    private String name;
    private Iterable<Sheet> sheets;

    private CommandManager commandManager;

    public void load(String filePath) {}
    public void save(String filePath) {}
}

class SheetFormat
{
    private String name;
    private double width, height;
}

class Sheet extends Canvas
{
    private String name;
    private SheetFormat format;

    private double zoomLevel;
    private Tool currentTool;

    void drawGrid(double size) {}
    void zoom(double factor) {}
}

interface Shape
{
    boolean contains(double x, double y);

    void draw(GraphicsContext gc);
    void redraw(GraphicsContext gc, double zoom);
    void rotate(GraphicsContext gc, double angle);
    void translate(GraphicsContext gc, double deltaX, double deltaY);
    void mirror(GraphicsContext gc, boolean vertical, boolean horizontal);
    void scale(GraphicsContext gc, double factorX, double factorY);
    void fill(GraphicsContext gc, Color color);
    void stroke(GraphicsContext gc, double width, Color color);

    double getZIndex();
    void setZIndex(GraphicsContext gc, int zIndex);
}

abstract class BaseShape implements Shape
{
    private double zIndex;

    @Override
    public double getZIndex()
    {
        return zIndex;
    }

    @Override
    public void setZIndex(GraphicsContext gc, int zIndex)
    {
        this.zIndex = zIndex;
    }
}

interface Tool
{
    void mouseDown(double mouseX, double mouseY);
    void mouseUp(double mouseX, double mouseY);
}

class CommandManager
{
    private Deque<Command> stack;

    public void execute(Command command) {}
    public void undo() {}
    public void redo() {}
}
interface Command
{
    void execute();
    void rollback();
}
class ShapeGroup extends BaseShape
{
    private Iterable<Shape> shapes;

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public void draw(GraphicsContext gc) {

    }

    @Override
    public void redraw(GraphicsContext gc, double zoom) {

    }

    @Override
    public void rotate(GraphicsContext gc, double angle) {

    }

    @Override
    public void translate(GraphicsContext gc, double deltaX, double deltaY) {

    }

    @Override
    public void mirror(GraphicsContext gc, boolean vertical, boolean horizontal) {

    }

    @Override
    public void scale(GraphicsContext gc, double factorX, double factorY) {

    }

    @Override
    public void fill(GraphicsContext gc, Color color) {

    }

    @Override
    public void stroke(GraphicsContext gc, double width, Color color) {

    }

    @Override
    public double getZIndex() {
        return 0;
    }

    @Override
    public void setZIndex(GraphicsContext gc, int zIndex) {

    }
}

class CustomShape extends BaseShape
{
    private ShapeGroup group;

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public void draw(GraphicsContext gc) {

    }

    @Override
    public void redraw(GraphicsContext gc, double zoom) {

    }

    @Override
    public void rotate(GraphicsContext gc, double angle) {

    }

    @Override
    public void translate(GraphicsContext gc, double deltaX, double deltaY) {

    }

    @Override
    public void mirror(GraphicsContext gc, boolean vertical, boolean horizontal) {

    }

    @Override
    public void scale(GraphicsContext gc, double factorX, double factorY) {

    }

    @Override
    public void fill(GraphicsContext gc, Color color) {

    }

    @Override
    public void stroke(GraphicsContext gc, double width, Color color) {

    }

    @Override
    public double getZIndex() {
        return 0;
    }

    @Override
    public void setZIndex(GraphicsContext gc, int zIndex) {

    }
}

class ShapeManager
{
    private Iterable<Shape> shapes;
    private GraphicsContext context;
    private Shape copiedShape;

    void draw(Tool t) {}
    void deleteShape(Shape s) {}
    void copyShape(Shape s) {}
    void pasteShape() {}
    void groupShapes(Iterable<Shape> shapes) {}
    void ungroupShapes(ShapeGroup g) {}
    void moveToFront(Shape s) {}
    void moveToBack(Shape s) {}
    void moveForward(Shape s) {}
    void moveBackward(Shape s) {}

    Shape getSelectedShape(double mouseX, double mouseY) {return null;}

    void importCustomShape(String libraryName) {}
    void exportCustomShape(CustomShape s, String libraryName) {}
}