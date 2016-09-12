package module_5.practice.task_1;

public final class Triangle extends View{
    private boolean isShowing = false;

    @Override
    public void show() {
        if(isShowing){
            System.out.println("Sorry! This triangle is showing now!");
        }else {
            System.out.println("Showing Triangle");
            isShowing = true;
        }
//        changeViewState("showing");
    }

    @Override
    public void hide() {
        if(!isShowing){
            System.out.println("Sorry! This triangle isn't showing now!");
        }else {
            System.out.println("Hiding Triangle");
            isShowing = false;
        }
//        changeViewState("hiding");
    }

//    private void changeViewState(String message){
//        String hiding = "hiding";
//        String showing = "showing";
//        if(message.equals(showing)){
//            System.out.println("Sorry! This triangle isn't " + message + " now!");
//        }else {
//            if(message.equals(showing)) {
//                message = hiding;
//            }
//            System.out.println(message + " Triangle");
//            isShowing = false;
//        }
//    }

    public boolean isShowing(){
        System.out.println("Triangle is " + (isShowing ? "showing" : "not showing"));
        return isShowing;
    }
}
