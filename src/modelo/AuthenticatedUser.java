package modelo;

public record AuthenticatedUser(long id, String nombreCompleto, String correo, Role role) {
}
