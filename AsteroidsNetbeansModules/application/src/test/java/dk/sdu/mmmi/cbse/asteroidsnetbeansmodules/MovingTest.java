//package dk.sdu.mmmi.cbse.asteroidsnetbeansmodules;
//
//import dk.sdu.mmmi.cbse.common.bullet.BulletSPI;
//import dk.sdu.mmmi.cbse.common.data.Entity;
//import dk.sdu.mmmi.cbse.common.data.GameData;
//import dk.sdu.mmmi.cbse.common.data.GameKeys;
//import dk.sdu.mmmi.cbse.common.data.World;
//import dk.sdu.mmmi.cbse.common.data.entityparts.LifePart;
//import dk.sdu.mmmi.cbse.common.data.entityparts.MovingPart;
//import dk.sdu.mmmi.cbse.common.data.entityparts.PositionPart;
//import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
//import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
//import java.io.IOException;
//import static java.nio.file.Files.copy;
//import static java.nio.file.Paths.get;
//import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
//import java.util.List;
//import java.util.concurrent.CopyOnWriteArrayList;
//import java.util.logging.Level;
//
//import dk.sdu.mmmi.cbse.core.main.Game;
//import dk.sdu.mmmi.cbse.playersystem.Player;
//import junit.framework.Test;
//import org.netbeans.junit.NbModuleSuite;
//import org.netbeans.junit.NbTestCase;
//import org.openide.util.Lookup;
//import static org.mockito.Mockito.*;
//
//
//public class MovingTest extends NbTestCase{
//    private Lookup.Result<IGamePluginService> result;
////    private final GameData gameData;
//
//
//    public static Test suite() {
//        return NbModuleSuite.createConfiguration(MovingTest.class).
//                gui(false).
//                failOnMessage(Level.WARNING). // works at least in RELEASE71
//                        failOnException(Level.INFO).
//                enableClasspathModules(false).
//                clusters(".*").
//                suite(); // RELEASE71+, else use NbModuleSuite.create(NbModuleSuite.createConfiguration(...))
//    }
//
//    public MovingTest (String n){super(n);}
//
//    public void testMoving() throws InterruptedException, IOException{
////
////        GameData gameData = new GameData();
////        World world = new World();
////        process(gameData, world);
////        Thread.sleep(10000);
////
////        for (Entity player : world.getEntities(Player.class)) {
////            PositionPart positionPart = player.getPart(PositionPart.class);
////            MovingPart movingPart = player.getPart(MovingPart.class);
////            LifePart lifePart = player.getPart(LifePart.class);
////
//////            for (int i = 0; i <= 10; i++){
//////                int posX = movingPart.getDx()
//////            }
////
////
////
//////            if (gameData.getKeys().isDown(GameKeys.UP)){
//////                assertFalse("Player has moved", positionPart.getX() != gameData.getDisplayWidth() / 2 && positionPart.getY() != gameData.getDisplayHeight() / 2);
//////            }
////
////        }
//    }
//
//    public void process(GameData gameData, World world) {
//
//        for (Entity player : world.getEntities(Player.class)) {
//            PositionPart positionPart = player.getPart(PositionPart.class);
//            MovingPart movingPart = player.getPart(MovingPart.class);
//            LifePart lifePart = player.getPart(LifePart.class);
//
//            movingPart.setLeft(gameData.getKeys().isDown(GameKeys.LEFT));
//            movingPart.setRight(gameData.getKeys().isDown(GameKeys.RIGHT));
////            movingPart.setUp(gameData.getKeys().isDown(GameKeys.UP));
//            movingPart.setUp(true);
//            System.out.println(movingPart.getDx());
//            System.out.println(movingPart.getDy());
//
//
//            if (gameData.getKeys().isDown(GameKeys.SPACE)) {
//                Entity bullet = Lookup.getDefault().lookup(BulletSPI.class).createBullet(player, gameData);
//                world.addEntity(bullet);
//                assertFalse(gameData.getKeys().isDown(GameKeys.SPACE));
//            }
//
//            movingPart.process(gameData, player);
//            positionPart.process(gameData, player);
//            lifePart.process(gameData, player);
//
//            updateShape(player);
//
//        }
//    }
//
//    private void updateShape(Entity entity) {
//        float[] shapex = new float[4];
//        float[] shapey = new float[4];
//        PositionPart positionPart = entity.getPart(PositionPart.class);
//        float x = positionPart.getX();
//        float y = positionPart.getY();
//        float radians = positionPart.getRadians();
//
//        shapex[0] = (float) (x + Math.cos(radians) * entity.getRadius());
//        shapey[0] = (float) (y + Math.sin(radians) * entity.getRadius());
//
//        shapex[1] = (float) (x + Math.cos(radians - 4 * 3.1415f / 5) * entity.getRadius());
//        shapey[1] = (float) (y + Math.sin(radians - 4 * 3.1145f / 5) * entity.getRadius());
//
//        shapex[2] = (float) (x + Math.cos(radians + 3.1415f) * entity.getRadius() * 0.5);
//        shapey[2] = (float) (y + Math.sin(radians + 3.1415f) * entity.getRadius() * 0.5);
//
//        shapex[3] = (float) (x + Math.cos(radians + 4 * 3.1415f / 5) * entity.getRadius());
//        shapey[3] = (float) (y + Math.sin(radians + 4 * 3.1415f / 5) * entity.getRadius());
//
//        entity.setShapeX(shapex);
//        entity.setShapeY(shapey);
//    }
//
//    private void waitForUpdate(List<IEntityProcessingService> processors, List<IGamePluginService> plugins, long millis) throws InterruptedException {
//        // Needs time for silentUpdater to install all modules
//        Thread.sleep(millis);
//
//        processors.clear();
//        processors.addAll(Lookup.getDefault().lookupAll(IEntityProcessingService.class));
//
//        plugins.clear();
//        plugins.addAll(Lookup.getDefault().lookupAll(IGamePluginService.class));
//    }
//}
