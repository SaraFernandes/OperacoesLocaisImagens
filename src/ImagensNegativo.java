
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/************************************************************/
/* PI - PROCESSAMENTO DE IMAGNES                            */
/* UFT - UNIVERSIDADE FEDERAL DO TOCANTINS 2015             */
/* PROFESSOR: GLENDA BOTELHO                                */
/* SEGUNDO TRABALHO                                         */
/* TAYLA SOUZA                                              */
/* SARA FERNANDES                                           */
/* DATA DE ENTREGA : 01/12/2015                             */
/* SOMA - NEGATIVO da IMAGEN                                          */
/************************************************************/
public class ImagensNegativo {

    /**
     * @param args the command line arguments
     */
public static void main(String args[] ) throws IOException{
   BufferedImage imagem = null;
   imagem = ImageIO.read(
               //new File("/home/sara/Imagens/stitch.jpg")
           new File("/home/sara/NetBeansProjects/OperacoesLocaisImagens/src/stitch.jpg")
           
   );
  
   int largura = imagem.getWidth();
   int altura = imagem.getHeight();
   //Retorna um vetor (Matriz) inteiro representando os pixels da imagem
   int pixels[] = imagem.getRGB(0, 0, largura, altura, null, 0, largura);
   
   for (int col = 0; col < largura; col++) { //w = Largura
     for (int lin = 0; lin < altura; lin++) {//h = Altura 
  //Pega a cor em cada pixel e soma
  Color c = new Color(pixels[lin*largura + col]);
  pixels[lin*largura + col] = new 
  Color(255-c.getRed(),255-c.getBlue(),255-c.getGreen()).getRGB();
      }
 }
    //Seta um vetor inteiro representando os pixels da imagem
 imagem.setRGB(0, 0, largura, altura, pixels, 0, largura);
 ImageIO.write(imagem, "JPG", 
       
 new File("/home/sara/NetBeansProjects/OperacoesLocaisImagens/src/stitch2.jpg"));
 }

    
}
