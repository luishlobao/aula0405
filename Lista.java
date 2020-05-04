/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import java.util.Scanner;

/**
 *
 * @author Luish
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // exercicio 1
       
        String nomeUsuario; 
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        
        nomeUsuario = teclado.next();
        System.out.println("Olá! seu nome é: "+nomeUsuario);
        
               
       //exercicio 2
       
       String nomeUsuario2;
       
       int nota1;
       int nota2;
       int nota3;
       int nota4; 
       int media;
       
       
       System.out.println("Digite o seu nome:");
       System.out.println("Digite a nota 1 :");
       System.out.println("Digite a nota 2 :");
       System.out.println("Digite a nota 3 :");
       System.out.println("Digite a nota 4 :");
        
        nota1 = teclado.nextInt();
        nota2 = teclado.nextInt();
        nota3 = teclado.nextInt();
        nota4 = teclado.nextInt();
        
        
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("Sua media é: " +media);
        
      //exercicio 3
      
      int entrada;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar número: ");
        entrada = scanner.nextInt();

        int multiplicador = 0;
        while(multiplicador <= 10)
        {
            int resultado = entrada * multiplicador;
            System.out.println("A tabuada e: "+resultado);   
            multiplicador++;
        }
       
        //4
        
        float a, b, h;
     
        System.out.println("Digite a base do triangulo:");
        b = teclado.nextFloat();
        
        System.out.println("Digite a altura do triangulo:");
        h = teclado.nextFloat();
        
        a = (b * h) / 2;
        System.out.println("A area do triangulo e " +a);
        
        float l, a2;
        System.out.println("Digite o lado do Quadrado");
        l = teclado.nextFloat();
            
        a2 = l * l;
        System.out.println("A area do quadrado e " +a2);
        
        double imc, kg, altura;
        
        System.out.println("Digite sua altura:");
        altura = teclado.nextFloat();
        System.out.println("Digite seu peso: ");
        kg = teclado.nextFloat();
        
        imc = kg / (altura * altura);
        System.out.println("Seu IMC e: " +imc);
        
        //5 
        
        float km, milhas;
        
        System.out.println("Digite a quantidade de Km: ");
        km = teclado.nextFloat();
        
        milhas = (float) (km / 1.60934);
        System.out.println("A quantidade de milhas: " +milhas);
        
        //6
        
        int meses, dias;
        
        System.out.println("Digite a quantidade de meses: ");
        meses = teclado.nextInt();
        
        dias = meses * 30;
        System.out.println("Nessa quantidade de meses tem " +dias+ " dias");
        
      
        
        
    }
        
        
        
        
        
        
        
        
        
      
        
        
        
        
        
        
   
      
          
        
    
    }
    
    
    

