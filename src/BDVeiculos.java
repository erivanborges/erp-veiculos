
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class BDVeiculos {
    private List<Passeio> listaPasseio;
    private List<Carga> listaCarga;
    
    public boolean verifPasseioExist(Passeio passeio) throws VeicExistException {
        for (int i = 0; i < listaPasseio.size(); i++) {
            if (this.getListaPasseio().get(i) != null) {
                if (this.getListaPasseio().get(i).getPlaca().equalsIgnoreCase(passeio.getPlaca())) {
                    throw new VeicExistException();
                }
            }
        }
        return true;
    }
    
    public boolean verifCargaExist(Carga carga) throws VeicExistException {
        for (int i = 0; i < listaCarga.size(); i++) {
            if (this.getListaCarga().get(i) != null) {
                if (this.getListaCarga().get(i).getPlaca().equalsIgnoreCase(carga.getPlaca())) {
                    throw new VeicExistException();
                }
            }
        }
        return true;
    }
    
    public void imprimeVeiculoPasseio(Passeio veiculoPasseio, int i) {
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

    public void imprimeVeiculoCarga(Carga veiculoCarga, int i) {
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

    /**
     * @return the listaPasseio
     */
    public List<Passeio> getListaPasseio() {
        return listaPasseio;
    }

    /**
     * @param listaPasseio the listaPasseio to set
     */
    public void setListaPasseio(List<Passeio> listaPasseio) {
        this.listaPasseio = listaPasseio;
    }

    /**
     * @return the listaCarga
     */
    public List<Carga> getListaCarga() {
        return listaCarga;
    }

    /**
     * @param listaCarga the listaCarga to set
     */
    public void setListaCarga(List<Carga> listaCarga) {
        this.listaCarga = listaCarga;
    }
    
    
}
