package d7_abstract;

public class Tiger extends Animal{
    @Override
    public void cry() {
        System.out.println((this.getName()==null?"":this.getName())+"喵呜~");
    }
}
