package hello.proxy.pureproxy.decorator.code;

public abstract class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public String operation(){
        String result = component.operation();
        return result;
    }
}
