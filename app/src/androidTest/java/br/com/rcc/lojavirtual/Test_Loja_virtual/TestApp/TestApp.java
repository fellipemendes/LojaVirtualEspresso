package br.com.rcc.lojavirtual.Test_Loja_virtual.TestApp;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import br.com.rcc.lojavirtual.MainActivity;
import br.com.rcc.lojavirtual.Test_Loja_virtual.Robot.RobotApp;

public class TestApp {


    @Rule
    public ActivityTestRule<MainActivity>
            mActivityRule = new ActivityTestRule<>(MainActivity.class, false, true); //aqui eu set a tela que vou abrir


    @Test
    public void CheckDisplayItem(){
        new RobotApp()
                .CheckDisplay();
    }
    @Test
    public void CheckText(){
        new RobotApp()
                .CheckTextDisplay();

    }
    @Test
    public void SelecionarLivro(){
        new RobotApp()
                .checkCSharpLivro()
                .checkAndroidLivro()
                .checkJavaLivro();
    }

    @Test
    public void ComprarLivroCSharp() throws InterruptedException {
        new RobotApp()
                .checkCSharpLivro()
                .clicarBtnComprar()
                .checkTextComprarCSharp();
    }

    @Test
    public void ComprarLivroAndroid() throws InterruptedException {
        new RobotApp()
                .checkAndroidLivro()
                .clicarBtnComprar()
                .checkTextComprarAndroid();
    }

    @Test
    public void ComprarLivroJava() throws InterruptedException {
        new RobotApp()
                .checkJavaLivro()
                .clicarBtnComprar()
                .checkTextComprarJava();
    }
}