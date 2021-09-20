
package ec.its.reserva.cine.com;

public class ClienteNormal extends Cliente {
    private Integer precionormal;

    public Integer getPrecionormal() {
        return precionormal;
    }

    public void setPrecionormal(Integer precionormal) {
        this.precionormal = precionormal;
    }
    
    public ClienteNormal asignarValores()
    {
        ClienteNormal clienteNormal = new ClienteNormal();
        clienteNormal.setId(1);
        clienteNormal.setNombre("Jenny");
        clienteNormal.setApellido("Pucha");
        clienteNormal.setEdad(32);
        clienteNormal.setPrecionormal(5);
        return clienteNormal;
    }
}
