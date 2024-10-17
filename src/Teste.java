
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    private static BDVeiculos bdveic = new BDVeiculos();
    private static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("########### ATENÇÃO ###########");
        System.out.println(" ");

        boolean continuar = true;
        int opcao = 0;

        while (continuar) {
            System.out.println("\n\t\t\tMENU INICIAL");
            System.out.println("\t(1) Cadastrar veículo de PASSEIO");
            System.out.println("\t(2) Cadastrar veículo de CARGA");
            System.out.println("\t(3) Imprimir todos os veículos de PASSEIO");
            System.out.println("\t(4) Imprimir todos os veículos de CARGA");
            System.out.println("\t(5) Imprimir todos os veículos de PASSEIO pela placa");
            System.out.println("\t(6) Imprimir todos os veículos de CARGA pela placa");
            System.out.println("\t(7) Sair do sistema");

            try {
                System.out.println("\n\tEscolha uma opção");
                opcao = ler.nextInt();
            } catch (NumberFormatException ex) {
                Scanner s = new Scanner(System.in);
                System.out.println("Favor informar um valor inteiro - Press <ENTER>");
                s.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    boolean sairPasseio = false;
                    while (!sairPasseio) {

                        veiculoPasseio = new Passeio();
                        veiculoPasseio = cadastraVeiculoPasseio(veiculoPasseio);

                        try {
                            if (bdveic.verifPasseioExist(veiculoPasseio)) {
                                bdveic.getListaPasseio().add(veiculoPasseio);
                            }
                        } catch (VeicExistException ex) {
                            ex.impVeicExistEx();
                            break;
                        }

                        Scanner s = new Scanner(System.in);
                        System.out.println("\nDeseja cadastrar outro veículo de PASSEIO? <s/n>");
                        String respPasseio = s.nextLine();

                        if (respPasseio.equalsIgnoreCase("n")) {
                            sairPasseio = true;
                        }
                    }
                    break;
                case 2:
                    boolean sairCarga = false;
                    while (!sairCarga) {

                        veiculoCarga = new Carga();
                        veiculoCarga = cadastraVeiculoCarga(veiculoCarga);

                        try {
                            if (bdveic.verifCargaExist(veiculoCarga)) {
                                bdveic.getListaCarga().add(veiculoCarga);
                            }
                        } catch (VeicExistException ex) {
                            ex.impVeicExistEx();
                            break;
                        }

                        Scanner s = new Scanner(System.in);
                        System.out.println("\nDeseja cadastrar outro veículo de CARGA? <s/n>");
                        String respCarga = s.next();

                        if (respCarga.equalsIgnoreCase("n")) {
                            sairCarga = true;
                        }

                    }
                    break;
                case 3:
                    System.out.println("\nVeículo de PASSEIO - Imprimindo TODOS os veículos.");
                    System.out.println("====================================================");
                    for (int i = 0; i < bdveic.getListaPasseio().size(); i++) {
                        if (bdveic.getListaPasseio().get(i) != null) {
                            bdveic.imprimeVeiculoPasseio(bdveic.getListaPasseio().get(i), i);
                        } else {
                            Scanner s = new Scanner(System.in);
                            System.out.println("\nSem mais veículos de PASSEIO para imprimir - press <ENTER>");
                            s.nextLine();
                        }
                    }
                    System.out.println("======================================================");
                    break;
                case 4:
                    System.out.println("\nVeículo de CARGA - Imprimindo TODOS os veículos.");
                    System.out.println("==================================================");
                    for (int i = 0; i < bdveic.getListaCarga().size(); i++) {
                        if (bdveic.getListaCarga().get(i) != null) {
                            bdveic.imprimeVeiculoCarga(bdveic.getListaCarga().get(i), i);
                        } else {
                            Scanner s = new Scanner(System.in);
                            System.out.println("\nSem mais veículos de CARGA para imprimir - press <ENTER>");
                            s.nextLine();
                        }
                    }
                    System.out.println("=======================================================");
                    break;
                case 5:
                    System.out.println("\nConsultar veículo pela PLACA - Veículo de PASSEIO");
                    System.out.println("===================================================");

                    veiculoPasseio = new Passeio();

                    System.out.println("\nInforme a placa a ser pesquisada");
                    String placaVeicPasseio = ler.next();

                    veiculoPasseio.setPlaca(placaVeicPasseio);

                    for (int i = 0; i < vetVeiculoPasseio.length; i++) {
                        if (vetVeiculoPasseio[i].getPlaca().equalsIgnoreCase(veiculoPasseio.getPlaca())) {
                            imprimeVeiculoPasseio(vetVeiculoPasseio[i], i);
                            break;
                        } else {
                            Scanner s = new Scanner(System.in);
                            System.out.println("\n\n\t\t\t========= Não existe veículo de PASSEIO com está PLACA *"
                                    + placaVeicPasseio + "* - press <ENTER>");
                            s.nextLine();
                        }

                    }
                    break;
                case 6:
                    System.out.println("\nConsultar veículo pela PLACA - Veículo de CARGA");
                    System.out.println("=================================================");

                    veiculoCarga = new Carga();
                    System.out.println("\nInforme a placa a ser pesquisada");
                    String placaVeicCarga = ler.next();

                    veiculoCarga.setPlaca(placaVeicCarga);

                    for (int i = 0; i < vetVeiculoCarga.length; i++) {
                        if (vetVeiculoCarga[i].getPlaca().equalsIgnoreCase(veiculoCarga.getPlaca())) {
                            imprimeVeiculoCarga(veiculoCarga, i);
                            break;
                        } else {
                            Scanner s = new Scanner(System.in);
                            System.out.println("\n\n\t\t\t======== Não existe veículo de Carga com está PLACA *"
                                    + placaVeicCarga + "* - press <ENTER>");
                            s.nextLine();
                        }

                    }
                    break;
                case 7:
                    continuar = false;
                    break;

            }
        }

    }

    public static Passeio cadastraVeiculoPasseio(Passeio veiculoPasseio) {
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
        try {
            veiculoPasseio.setVelocMax(ler.nextFloat());
        } catch (VelocException ex) {
            ex.impVelocEx();
        }
        System.out.println("Qtdade de Passageiros.............:");
        veiculoPasseio.setQtdPassageiros(ler.nextInt());
        System.out.println("Potência do Motor.................:");
        veiculoPasseio.getMotor().setPotencia(ler.nextInt());
        System.out.println("Qtdade de Pistões do Motor.........:");
        veiculoPasseio.getMotor().setQtdPistao(ler.nextInt());
        return veiculoPasseio;
    }

    public static Carga cadastraVeiculoCarga(Carga veiculoCarga) {
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
        try {
            veiculoCarga.setVelocMax(ler.nextFloat());
        } catch (VelocException ex) {
            ex.impVelocEx();
        }
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
