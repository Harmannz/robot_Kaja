package jetbrains.mps.samples.KajaSceneConstruction.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int AbstractBuilderCommand = 0;
  public static final int AbstractRoad = 1;
  public static final int BuildWall = 2;
  public static final int Colour = 3;
  public static final int DestroyWall = 4;
  public static final int DirectionQueue = 5;
  public static final int DropMark = 6;
  public static final int Green = 7;
  public static final int PickMark = 8;
  public static final int Red = 9;
  public static final int Road = 10;
  public static final int Steps = 11;
  public static final int TrafficLight = 12;
  public static final int Vehicle = 13;
  public static final int Yellow = 14;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xb56912a3674f4530L, 0xb0cf55261b526a1fL);
    builder.put(0x2c8eb033a834fe3fL, AbstractBuilderCommand);
    builder.put(0x5faacf6e150bf47L, AbstractRoad);
    builder.put(0x2c8eb033a8341e10L, BuildWall);
    builder.put(0xb100b752e59505dL, Colour);
    builder.put(0x2c8eb033a834fa55L, DestroyWall);
    builder.put(0x5a44aab7624eb37cL, DirectionQueue);
    builder.put(0x2c8eb033a834fe3eL, DropMark);
    builder.put(0xb100b752e595060L, Green);
    builder.put(0x2c8eb033a835165fL, PickMark);
    builder.put(0xb100b752e59505fL, Red);
    builder.put(0x5faacf6e150bf2bL, Road);
    builder.put(0x5a44aab7629773cdL, Steps);
    builder.put(0x5faacf6e150bf7eL, TrafficLight);
    builder.put(0x5a44aab7623318d8L, Vehicle);
    builder.put(0xb100b752e59505eL, Yellow);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
