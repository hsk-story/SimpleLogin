package top.seraphjack.simplelogin;

import top.seraphjack.simplelogin.server.storage.Position;

public class SLConstants {
    public static final Position defaultPosition = new Position(0, 255, 0);
    public static final String defaultBcryptSalt = "$2a$10$PJChvqf59bixTBN3MVaZCe";
    public static final String MODID = "simplelogin";
    public static final String VERSION = "@VERSION_INJECT@";
}
