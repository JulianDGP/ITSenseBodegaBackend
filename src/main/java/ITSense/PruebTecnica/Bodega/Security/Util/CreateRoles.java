//package ITSense.PruebTecnica.Bodega.Security.Util;
//
//import ITSense.PruebTecnica.Bodega.Security.Entity.Rol;
//import ITSense.PruebTecnica.Bodega.Security.Enums.RolNombre;
//import ITSense.PruebTecnica.Bodega.Security.Service.RolService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CreateRoles implements CommandLineRunner {
//    @Autowired
//    RolService rolService;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
//        Rol rolUser = new Rol(RolNombre.ROLE_USER);
//        rolService.save(rolAdmin);
//        rolService.save(rolUser);
//    }
//}
