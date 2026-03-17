public class Vaca extends Animal{

    public Vaca(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + "diz:Muuuuu!!");
    }
}
