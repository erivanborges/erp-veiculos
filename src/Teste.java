
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Teste {
    
    private static Passeio veiculoPasseio;
    private static Carga veiculoCarga;
    
    private static Passeio[] vetVeiculoPasseio = new Passeio[5];
    private static Carga[] vetVeiculoCarga = new Carga[5];
    
    private static Scanner ler;
    
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("########### ATENÇÃO ###########");
        System.out.println(" ");
        
    }
    
    public static int achaVagoPasseio() {
        for (int i = 0; i < vetVeiculoPasseio.length; i++) {
            if (vetVeiculoPasseio[i] == null) {
                return i;
            }
        }
        return -1;
    }
    
    public static int achaVagoCarga() {
        for (int i = 0; i < vetVeiculoCarga.length; i++) {
            if (vetVeiculoCarga[i] == null) {
                return i;
            }
        }
        return -1;
    }
    
    public static void imprimeVeiculoPasseio(Passeio veiculoPasseio, int i) {
        System.out.println("\n O veiculo de`PASSEIO armazenado no endereço.......: " + i + " (vetor do vetVeiculoPasseio)");
        System.out.println("Cor.............................: " + veiculoPasseio.getCor());
        System.out.println("Marca...........................: " + veiculoPasseio.getMarca());
        System.out.println("Placa...........................: " + veiculoPasseio.getPlaca());
        System.out.println("Qtdade de Rodas.................: " + veiculoPasseio.getQtdRodas());
        System.out.println("Potência do Motor...............: " + veiculoPasseio.getMotor().getPotencia());
        System.out.println("Qtdade Pistões do Moto..........: " + veiculoPasseio.getMotor().getQtdPistao());
        System.out.println("Veloc. Máxima...................: " + veiculoPasseio.getVelocMax());
        System.out.println("Qtdade de Passageiros...........: " + veiculoPasseio.getQtdPassageiros());
    }
    
    public static void imprimeVeiculoCarga(Carga veiculoCarga, int i) {
        System.out.println("\n O veiculo de CARGA armazenado no endereço " + i + " (vetor do vetVeiculoCarga)");
        System.out.println("Cor.............................: " + veiculoCarga.getCor());
        System.out.println("Marca...........................: " + veiculoCarga.getMarca());
        System.out.println("Placa...........................: " + veiculoCarga.getPlaca());
        System.out.println("Qtadade de Rodas................: " + veiculoCarga.getQtdRodas());
        System.out.println("Veloc. Máxima...................: " + veiculoCarga.getVelocMax());
        System.out.println("Carga Máxima....................: " + veiculoCarga.getCargaMax());
        System.out.println("Tara............................: " + veiculoCarga.getTara());
        System.out.println("Potência do Motor...............: " + veiculoCarga.getMotor().getPotencia());
        System.out.println("Qtdade Pistões do motor.........: " + veiculoCarga.getMotor().getQtdPistao());
    }
    
    public static Passeio cadastraVeiculoPasseio(Passeio veiculoPasseio) {
        ler = new Scanner(System.in);
        
        System.out.println("\n=================================");
        System.out.println("Cadastro de veículo de PASSEIO");
        System.out.println("==================================");
        System.out.println("Cor...............................:");
        veiculoPasseio.setCor(ler.next());
        System.out.println("Marca.............................:");
        veiculoPasseio.setMarca(ler.next());
        System.out.println("Modelo............................:");
        veiculoPasseio.setModelo(ler.next());
        System.out.println("Placa.............................:");
        veiculoPasseio.setPlaca(ler.next());
        System.out.println("Qtdade de Rodas...................:");
        veiculoPasseio.setQtdRodas(ler.nextInt());
        System.out.println("Veloc. Máxima.....................:");
        veiculoPasseio.setVelocMax(ler.nextFloat());
        System.out.println("Qtdade de Passageiros.............:");
        veiculoPasseio.setQtdPassageiros(ler.nextInt());
        System.out.println("Potência do Motor.................:");
        veiculoPasseio.getMotor().setPotencia(ler.nextInt());
        System.out.println("Qtdade de Pistões do Motor.........:");
        veiculoPasseio.getMotor().setQtdPistao(ler.nextInt());
        return veiculoPasseio;
    }
    
    public static Carga cadastraVeiculoCarga(Carga veiculoCarga) {
        ler = new Scanner(System.in);
        
        System.out.println("\n=================================");
        System.out.println("Casdastro de veículos de CARGA");
        System.out.println("=================================");
        System.out.println("Cor...............................:");
        veiculoCarga.setCor(ler.next());
        System.out.println("Marca.............................:");
        veiculoCarga.setMarca(ler.next());
        System.out.println("Modelo............................:");
        veiculoCarga.setModelo(ler.next());
        System.out.println("Placa.............................:");
        veiculoCarga.setPlaca(ler.next());
        System.out.println("Qtdade de Rodas...................:");
        veiculoCarga.setQtdRodas(ler.nextInt());
        System.out.println("Veloc. Máxima.....................:");
        veiculoCarga.setVelocMax(ler.nextFloat());
        System.out.println("Carga Máxima......................:");
        veiculoCarga.setCargaMax(ler.nextInt());
        System.out.println("Tara..............................:");
        veiculoCarga.setTara(ler.nextInt());
        System.out.println("Potência do Motor.................:");
        veiculoCarga.getMotor().setPotencia(ler.nextInt());
        System.out.println("Qtdade de Pistões do Motor........:");
        veiculoCarga.getMotor().setQtdPistao(ler.nextInt());
        return veiculoCarga;  
    }
    
}
