/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author bruno.191196
 */
public class Editor {
  
  public String abrirArquivo (File arquivo) {
    String texto = "";
    try {
      FileReader fr = new FileReader(arquivo);
      BufferedReader br = new BufferedReader(fr);
      String linha;
      while ((linha = br.readLine()) != null) {
        texto = (texto.concat(linha) + "\n");
      }
      br.close();
    } 
    catch (FileNotFoundException ex) {
      System.out.println("Não foi possível abrir o arquivo");
    }
    catch(IOException ex) {
        System.out.println("Erro ao ler arquivo");
    }
    return texto;
  }
  
  public void escreverArquivo (String arquivo, String texto) {
    try {
      FileWriter fw = new FileWriter(arquivo);
      BufferedWriter bw = new BufferedWriter(fw);
      String[] linhas = texto.split("\n");
      for (String linha : linhas) {
        bw.write(linha);
        bw.newLine();
      }
      bw.close();
    } 
    catch (FileNotFoundException ex) {
      System.out.println("Não foi possível abrir o arquivo");
    }
    catch(IOException ex) {
        System.out.println("Erro ao ler arquivo");
    }
  }
}
