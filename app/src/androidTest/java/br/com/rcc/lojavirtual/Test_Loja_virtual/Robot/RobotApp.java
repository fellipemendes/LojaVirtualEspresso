package br.com.rcc.lojavirtual.Test_Loja_virtual.Robot;

import br.com.rcc.lojavirtual.R;
import br.com.rcc.lojavirtual.common.ScreenRobot;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.isDialog;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.MENSAGEM_LIVRO_ANDROID;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.MENSAGEM_LIVRO_COMPRA;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.MENSAGEM_LIVRO_CSHARP;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.MENSAGEM_LIVRO_JAVA;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.NOME_APP;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.NOME_LIVRO_01;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.NOME_LIVRO_02;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.NOME_LIVRO_03;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.TEXTO_COMPRAR;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.TEXTO_HEADER;


public class RobotApp extends ScreenRobot {
    public static final int LVR_CSHARP  = R.id.cbCsharp;
    public static final int LVR_ANDROID = R.id.cbAndroid;
    public static final int LVR_JAVA    = R.id.cbJava;
    public static final int LVR_HEADER   = R.id.tvMensagem;
    public static final int LVR_COMPRAR   = R.id.btComprar;

    public RobotApp CheckDisplay() {
        checkIsDisplayed(LVR_CSHARP);
        checkIsDisplayed(LVR_ANDROID);
        checkIsDisplayed(LVR_JAVA);
        return this;
    }

    public RobotApp CheckTextDisplay() {
        checkViewHasText(LVR_CSHARP, NOME_LIVRO_01);
        checkViewHasText(LVR_ANDROID, NOME_LIVRO_02);
        checkViewHasText(LVR_JAVA, NOME_LIVRO_03);
        checkViewHasText(LVR_HEADER, TEXTO_HEADER);
        checkViewHasText(LVR_COMPRAR, TEXTO_COMPRAR);
        checkViewContainsText(NOME_APP);
        return this;
    }

    public RobotApp checkCSharpLivro() {
        clickOnView(LVR_CSHARP);
        return this;
    }

    public RobotApp checkAndroidLivro() {
        clickOnView(LVR_ANDROID);
        return this;
    }

    public RobotApp checkJavaLivro() {
        clickOnView(LVR_JAVA);
        return this;
    }

    public RobotApp clicarBtnComprar() {
        clickOnView(LVR_COMPRAR);
        return this;
    }

    public RobotApp checkTextComprarCSharp() {
        checkDialogWithTextIsDisplayed(MENSAGEM_LIVRO_COMPRA + MENSAGEM_LIVRO_CSHARP);
        return this;
    }

    public RobotApp checkTextComprarAndroid() {
        checkDialogWithTextIsDisplayed(MENSAGEM_LIVRO_COMPRA + MENSAGEM_LIVRO_ANDROID);
        return this;
    }

    public RobotApp checkTextComprarJava() {
        checkDialogWithTextIsDisplayed(MENSAGEM_LIVRO_COMPRA + MENSAGEM_LIVRO_JAVA);
        return this;
    }
}
