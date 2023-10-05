module MainApp {
    uses edu.hneu.mjt.Valentyn.bank.Bank;
    uses edu.hneu.mjt.Valentyn.api.Service;
    requires jmp.dto;
    requires jmp.bank.api;
    requires jmp.service.api;
    exports edu.hneu.Valentyn.app;
}