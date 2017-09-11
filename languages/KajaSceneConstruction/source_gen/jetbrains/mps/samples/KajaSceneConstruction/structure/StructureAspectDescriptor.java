package jetbrains.mps.samples.KajaSceneConstruction.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptAbstractBuilderCommand = createDescriptorForAbstractBuilderCommand();
  /*package*/ final ConceptDescriptor myConceptAbstractRoad = createDescriptorForAbstractRoad();
  /*package*/ final ConceptDescriptor myConceptBuildWall = createDescriptorForBuildWall();
  /*package*/ final ConceptDescriptor myConceptDestroyWall = createDescriptorForDestroyWall();
  /*package*/ final ConceptDescriptor myConceptDirectionQueue = createDescriptorForDirectionQueue();
  /*package*/ final ConceptDescriptor myConceptDropMark = createDescriptorForDropMark();
  /*package*/ final ConceptDescriptor myConceptPickMark = createDescriptorForPickMark();
  /*package*/ final ConceptDescriptor myConceptRoad = createDescriptorForRoad();
  /*package*/ final ConceptDescriptor myConceptSteps = createDescriptorForSteps();
  /*package*/ final ConceptDescriptor myConceptTrafficLight = createDescriptorForTrafficLight();
  /*package*/ final ConceptDescriptor myConceptVehicle = createDescriptorForVehicle();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAbstractBuilderCommand, myConceptAbstractRoad, myConceptBuildWall, myConceptDestroyWall, myConceptDirectionQueue, myConceptDropMark, myConceptPickMark, myConceptRoad, myConceptSteps, myConceptTrafficLight, myConceptVehicle);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.AbstractBuilderCommand:
        return myConceptAbstractBuilderCommand;
      case LanguageConceptSwitch.AbstractRoad:
        return myConceptAbstractRoad;
      case LanguageConceptSwitch.BuildWall:
        return myConceptBuildWall;
      case LanguageConceptSwitch.DestroyWall:
        return myConceptDestroyWall;
      case LanguageConceptSwitch.DirectionQueue:
        return myConceptDirectionQueue;
      case LanguageConceptSwitch.DropMark:
        return myConceptDropMark;
      case LanguageConceptSwitch.PickMark:
        return myConceptPickMark;
      case LanguageConceptSwitch.Road:
        return myConceptRoad;
      case LanguageConceptSwitch.Steps:
        return myConceptSteps;
      case LanguageConceptSwitch.TrafficLight:
        return myConceptTrafficLight;
      case LanguageConceptSwitch.Vehicle:
        return myConceptVehicle;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForAbstractBuilderCommand() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.KajaSceneConstruction", "AbstractBuilderCommand", 0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a834fe3fL);
    b.class_(false, true, false);
    b.super_("jetbrains.mps.samples.Kaja.structure.AbstractCommand", 0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc4574aL);
    b.origin("r:ce42c9d0-9778-4b7f-ba63-609d51a475fd(jetbrains.mps.samples.KajaSceneConstruction.structure)/3210697320273608255");
    b.prop("row", 0x2c8eb033a834fe40L, "3210697320273608256");
    b.prop("col", 0x2c8eb033a834fe41L, "3210697320273608257");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAbstractRoad() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.KajaSceneConstruction", "AbstractRoad", 0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x5faacf6e150bf47L);
    b.class_(false, true, false);
    b.origin("r:ce42c9d0-9778-4b7f-ba63-609d51a475fd(jetbrains.mps.samples.KajaSceneConstruction.structure)/430846890709401415");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBuildWall() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.KajaSceneConstruction", "BuildWall", 0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a8341e10L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.samples.KajaSceneConstruction.structure.AbstractBuilderCommand", 0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a834fe3fL);
    b.origin("r:ce42c9d0-9778-4b7f-ba63-609d51a475fd(jetbrains.mps.samples.KajaSceneConstruction.structure)/3210697320273550864");
    b.alias("build wall");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDestroyWall() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.KajaSceneConstruction", "DestroyWall", 0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a834fa55L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.samples.KajaSceneConstruction.structure.AbstractBuilderCommand", 0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a834fe3fL);
    b.origin("r:ce42c9d0-9778-4b7f-ba63-609d51a475fd(jetbrains.mps.samples.KajaSceneConstruction.structure)/3210697320273607253");
    b.alias("destroy wall");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDirectionQueue() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.KajaSceneConstruction", "DirectionQueue", 0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x5a44aab7624eb37cL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.samples.Kaja.structure.LogicalExpression", 0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ec9fc1L);
    b.origin("r:ce42c9d0-9778-4b7f-ba63-609d51a475fd(jetbrains.mps.samples.KajaSceneConstruction.structure)/6504511466434900860");
    b.aggregate("direction", 0x5a44aab7624eb3c3L).target(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ed0d39L).optional(true).ordered(true).multiple(true).origin("6504511466434900931").done();
    b.alias("directions to take");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDropMark() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.KajaSceneConstruction", "DropMark", 0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a834fe3eL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.samples.KajaSceneConstruction.structure.AbstractBuilderCommand", 0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a834fe3fL);
    b.origin("r:ce42c9d0-9778-4b7f-ba63-609d51a475fd(jetbrains.mps.samples.KajaSceneConstruction.structure)/3210697320273608254");
    b.alias("drop mark");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPickMark() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.KajaSceneConstruction", "PickMark", 0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a835165fL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.samples.KajaSceneConstruction.structure.AbstractBuilderCommand", 0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a834fe3fL);
    b.origin("r:ce42c9d0-9778-4b7f-ba63-609d51a475fd(jetbrains.mps.samples.KajaSceneConstruction.structure)/3210697320273614431");
    b.alias("pick mark");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForRoad() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.KajaSceneConstruction", "Road", 0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x5faacf6e150bf2bL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.samples.KajaSceneConstruction.structure.AbstractBuilderCommand", 0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a834fe3fL);
    b.origin("r:ce42c9d0-9778-4b7f-ba63-609d51a475fd(jetbrains.mps.samples.KajaSceneConstruction.structure)/430846890709401387");
    b.prop("length", 0x5faacf6e150bf73L, "430846890709401459");
    b.prop("orientation", 0x5faacf6e150bf75L, "430846890709401461");
    b.prop("direction", 0x5faacf6e150bf9cL, "430846890709401500");
    b.alias("build road");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSteps() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.KajaSceneConstruction", "Steps", 0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x5a44aab7629773cdL);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.samples.Kaja.structure.AbstractCommand", 0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc4574aL);
    b.origin("r:ce42c9d0-9778-4b7f-ba63-609d51a475fd(jetbrains.mps.samples.KajaSceneConstruction.structure)/6504511466439668685");
    b.prop("steps", 0x5a44aab7629773ceL, "6504511466439668686");
    b.alias("Run for");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForTrafficLight() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.KajaSceneConstruction", "TrafficLight", 0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x5faacf6e150bf7eL);
    b.class_(false, false, false);
    b.origin("r:ce42c9d0-9778-4b7f-ba63-609d51a475fd(jetbrains.mps.samples.KajaSceneConstruction.structure)/430846890709401470");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForVehicle() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.KajaSceneConstruction", "Vehicle", 0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x5a44aab7623318d8L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.samples.Kaja.structure.AbstractCommand", 0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc4574aL);
    b.origin("r:ce42c9d0-9778-4b7f-ba63-609d51a475fd(jetbrains.mps.samples.KajaSceneConstruction.structure)/6504511466433091800");
    b.prop("row", 0x5a44aab7623319a5L, "6504511466433092005");
    b.prop("col", 0x5a44aab7623319a7L, "6504511466433092007");
    b.prop("destinationRow", 0x5a44aab7623319aaL, "6504511466433092010");
    b.prop("destinationCol", 0x5a44aab7623319aeL, "6504511466433092014");
    b.aggregate("directionQueue", 0x5a44aab7624eb3c5L).target(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ed0d39L).optional(true).ordered(true).multiple(true).origin("6504511466434900933").done();
    b.aggregate("startingDirection", 0x5a44aab762ff42ebL).target(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ed0d39L).optional(false).ordered(true).multiple(false).origin("6504511466446471915").done();
    b.alias("add vehicle");
    return b.create();
  }
}
