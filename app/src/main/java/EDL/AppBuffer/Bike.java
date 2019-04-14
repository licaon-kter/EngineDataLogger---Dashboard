// automatically generated by the FlatBuffers compiler, do not modify

package EDL.AppBuffer;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Bike extends Table {
  public static Bike getRootAsBike(ByteBuffer _bb) { return getRootAsBike(_bb, new Bike()); }
  public static Bike getRootAsBike(ByteBuffer _bb, Bike obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public Bike __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long rpm() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public float speed() { int o = __offset(6); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public double oilTemp() { int o = __offset(8); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public boolean blinkLeft() { int o = __offset(10); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean blinkRight() { int o = __offset(12); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createBike(FlatBufferBuilder builder,
      long rpm,
      float speed,
      double oil_temp,
      boolean blink_left,
      boolean blink_right) {
    builder.startObject(5);
    Bike.addOilTemp(builder, oil_temp);
    Bike.addRpm(builder, rpm);
    Bike.addSpeed(builder, speed);
    Bike.addBlinkRight(builder, blink_right);
    Bike.addBlinkLeft(builder, blink_left);
    return Bike.endBike(builder);
  }

  public static void startBike(FlatBufferBuilder builder) { builder.startObject(5); }
  public static void addRpm(FlatBufferBuilder builder, long rpm) { builder.addLong(0, rpm, 0L); }
  public static void addSpeed(FlatBufferBuilder builder, float speed) { builder.addFloat(1, speed, 0.0f); }
  public static void addOilTemp(FlatBufferBuilder builder, double oilTemp) { builder.addDouble(2, oilTemp, 0.0); }
  public static void addBlinkLeft(FlatBufferBuilder builder, boolean blinkLeft) { builder.addBoolean(3, blinkLeft, false); }
  public static void addBlinkRight(FlatBufferBuilder builder, boolean blinkRight) { builder.addBoolean(4, blinkRight, false); }
  public static int endBike(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishBikeBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedBikeBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }
}

