
<div align="center">
  
# Testes Mobile 📱
  
  
Objetivo 🎯  &nbsp;&nbsp;Utilizando as melhores tecnologias atuais como, Java com BDD(Cucumber), Appium, UIautomatorviewer Android Studio, Sera realizado uam bateria de testes em um aplicativo nativo para validar suas funcionalidades.
  
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

##

## Fluxo da navegação

<div align="center">

<a href=""><img src="https://img.shields.io/badge/step-01-9cf"></a>&nbsp;


</div>

##



## License

<div align="center">
  
<p>This project is licensed under the MIT License. See the
  <a href="https://mit-license.org/">
  <img src="https://img.shields.io/static/v1?label=license&message=MIT&color=5965E0&labelColor=121214" alt="License">
  </a> file for details.</p>
<p>Made with&nbsp;💙 &nbsp;by Maic Miller</p>
  
<div>
