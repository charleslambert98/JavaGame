public class Model {
    int x = 0;
    int y = 0;
    int vel = 5;

    public Model(int width, int height, int imageWidth, int imageHeight) {
    }


    public void move(int dir){
        switch (dir){
            case 0: y -= vel;
                    break;
            case 1: y += vel;
                    break;
            case 2: x += vel;
                    break;
            case 3: x -= vel;
                    break;
        }
    }
    public void updateLocationAndDirection() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
