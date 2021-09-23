
<div align="center">
  
# Testes Mobile 📱
  
  
Objetivo 🎯  &nbsp;&nbsp;Utilizando as melhores tecnologias atuais como, Java com BDD(Cucumber), Appium, UIautomatorviewer Android Studio e Padrões de projetos como Page Object e Page Factory, realizei uma bateria de testes em um aplicativo nativo, para validar suas funcionalidades.
  
</div>
  
  <p align="center">
  <a href="#Tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#Documentação">Documentação</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#Variáveis-de-Ambiente">Variáveis de Ambiente</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#License">License</a>
</p>

<p align="center">
  <a href="https://mit-license.org/">
  <img src="https://img.shields.io/static/v1?label=license&message=MIT&color=5965E0&labelColor=121214" alt="License">.
  </a>
</p>

<br>

![homeScreen](https://user-images.githubusercontent.com/990877/134563936-3498f667-9a3d-46a2-ac3d-3c3710dba50d.png)

<p align="center">
  <a href="https://developer.android.com/">Android Studio</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://developer.android.com/docs">Doc's</a>&nbsp;&nbsp;&nbsp;
</p>

## Tecnologias

- [JDK 8](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html)
- [Eclipse](https://www.eclipse.org/)
- [Appium](https://appium.io/)
- [Vysor](https://www.vysor.io/)
- [MVN Repository](https://mvnrepository.com/)
- [Bash](https://www.gnu.org/software/bash/)
- [Git](https://git-scm.com/)

## Documentação

- [Docuentação Android Studio](https://developer.android.com/docs)
- [Docuentação Eclipse](https://help.eclipse.org/latest/index.jsp)
- [Documentação Appium](https://appium.io/docs/en/about-appium/intro/)

## Variáveis de Ambiente


Caminho do JDK
```script
/Library/Java/JavaVirtualMachines/jdk1.8.0_301.jdk
```

### Variáveis e ambiente para o uiautomator

Destino das varáveis de ambiente ⇢ ~ (home)

```script
➜ vim ~/.zshrc
```
```script
uiautomator() {
        export export PATH=$JAVA_HOME/Library/Java/JavaVirtualMachines/jdk1.8.0_301.jdk/Contents/Home:$PATH
        export ANDROID_HOME=/Users/maicmiller/Library/Android/sdk
        export PATH=$PATH:$ANDROID_HOME/platform-tools:$ANDROID_HOME/build-tools:$ANDROID_HOME/tools
        /Users/maicmiller/Library/Android/sdk/tools/bin/uiautomatorviewer
}
```

## Ambiente Android Studio

1º Passo - Criar novo projeto

![1](https://user-images.githubusercontent.com/990877/134569253-c7eda8a6-f6dc-4770-8b97-4cbd4081bece.png)
![2](https://user-images.githubusercontent.com/990877/134569053-7fab890b-4732-47cb-96a8-02f7c39d0811.png)
![3](https://user-images.githubusercontent.com/990877/134569683-e311b458-66dd-4411-a50c-878eb019cb28.png)
![4](https://user-images.githubusercontent.com/990877/134570019-d0bbf3af-4c3f-407a-adb0-e81285e42668.png)

Pegamos o valor do Android SDK location para configurar o Android Home
```script
/Users/<utilizador>/Library/Android/sdk
```
### Variáveis e ambiente para o Android Home

Destino das varáveis de ambiente ⇢ ~ (home)

```script
➜ vim ~/.zshrc
```

```script
export ANDROID_HOME=//Users/<utilizador>/Library/Android/sdk
export PATH=$ANDROID_HOME/platform-tools:$PATH
export PATH=$ANDROID_HOME/tools:$PATH
export PATH=$ANDROID_HOME/tools/bin:$PATH
export PATH=$ANDROID_HOME/emulator:$PATH
```
Comando adb
```script
adb
```
![6](https://user-images.githubusercontent.com/990877/134571024-44e9f996-a1f3-4250-9d85-01827a0d172d.png)

Comando uiautomatorviewer
```script
➜ sudo uiautomatorviewer
```
![7](https://user-images.githubusercontent.com/990877/134571552-bd24b3f6-12ce-4425-9cb6-9e894af14331.png)

## Criar um novo Virtual Device

![8](https://user-images.githubusercontent.com/990877/134571964-18599d79-e8de-42df-8451-5597cb1e739e.png)
![9](https://user-images.githubusercontent.com/990877/134572246-5f91c9bf-3f6f-4b4b-9c3c-81fdb73988a1.png)
![10](https://user-images.githubusercontent.com/990877/134572359-2beb66e8-3440-416c-b9d4-d04dfb437a6d.png)
![11](https://user-images.githubusercontent.com/990877/134572540-3c70d849-f8aa-49cf-a4e1-1cf9f4ad1a38.png)

### podemos fechar o Android Studio, vamos levantar o emulator via terminal.

```script
emulator @stffAVD &
```
![12](https://user-images.githubusercontent.com/990877/134573510-4dabb3de-78b6-46cb-9598-6530af5aa5f6.png)

## Instalação do Appium

- [Appium v1.15.0](https://github.com/appium/appium-desktop/releases/tag/v1.15.0)

opção: Appium-mac-1.15.0.dmg

![AppiumVersion15](https://user-images.githubusercontent.com/990877/134574367-71fefc9f-e8bf-4f10-9ef7-9a7585674c7d.png)
![AppiumApp](https://user-images.githubusercontent.com/990877/134574702-3787448a-0438-4833-94fd-6d6491337770.png)

### start server

Quando o Appium é iniciado ele nos fornece uma API-Rest

![AppiumStart](https://user-images.githubusercontent.com/990877/134575009-840d4ad2-0fab-4571-b611-5718268fac43.png)

# Configurando o Dispositivo Físico

* É necessário instalar o driver do celular no PC, apenas conectando-o via USB o computar instala o Driver automaticamente.
* Também é necessário habilitar o modo desenvolvedor no celular, cada modelo tem a sua forma.
* Habilitar a depuração de USB.

Instalando o Vysor

- [Vysor](https://www.vysor.io/)

![vysorDownload](https://user-images.githubusercontent.com/990877/134575975-2167a301-9b5a-4f75-a3b4-ea8424e3abe3.png)

Com o Vysor instalado e aberto, conecte o celular via cabo USB no computador.

![vysorInstalaldo](https://user-images.githubusercontent.com/990877/134576365-3465aafd-498e-4625-b903-7f48fcc919ac.png)

Dessa forma conseguimos vizualizar o dispositivo

![vysorMeuCell](https://user-images.githubusercontent.com/990877/134576760-89794863-ccce-46e7-bbd9-4a28ff420db7.png)

Acionamos o botão play para iniciar

![meuCell](https://user-images.githubusercontent.com/990877/134577300-e197bbf7-dea3-434a-8f13-bcd562ccc45a.png)

##




## License

<div align="center">
  
<p>This project is licensed under the MIT License. See the
  <a href="https://mit-license.org/">
  <img src="https://img.shields.io/static/v1?label=license&message=MIT&color=5965E0&labelColor=121214" alt="License">
  </a> file for details.</p>
<p>Made with&nbsp;💙 &nbsp;by Maic Miller</p>
  
<div>
