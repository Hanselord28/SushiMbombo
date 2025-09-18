public class Pedido {

    private String Cobertura;

    private String Relleno1;

    private String Relleno2;

    private String Relleno3;

    private Integer Cantidad;

    private boolean Chimbombo;

    public Pedido() {
    }

    public Pedido (String Cobertura, String Relleno1, String Relleno2, String Relleno3, Integer Cantidad, boolean Chimbombo) {
        this.Cobertura = Cobertura;
        this.Relleno1 = Relleno1;
        this.Relleno2 = Relleno2;
        this.Relleno3 = Relleno3;
        this.Cantidad = Cantidad;
        this.Chimbombo = Chimbombo;

    }

    public String getCobertura() {
        return Cobertura;
    }

    public void setCobertura(String cobertura) {
        Cobertura = cobertura;
    }

    public String getRelleno1() {
        return Relleno1;
    }

    public void setRelleno1(String relleno1) {
        Relleno1 = relleno1;
    }

    public String getRelleno2() {
        return Relleno2;
    }

    public void setRelleno2(String relleno2) {
        Relleno2 = relleno2;
    }

    public String getRelleno3() {
        return Relleno3;
    }

    public void setRelleno3(String relleno3) {
        Relleno3 = relleno3;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer cantidad) {
        Cantidad = cantidad;
    }

    public boolean isChimbombo() {
        return Chimbombo;
    }

    public void setChimbombo(boolean chimbombo) {
        Chimbombo = chimbombo;
    }

}
