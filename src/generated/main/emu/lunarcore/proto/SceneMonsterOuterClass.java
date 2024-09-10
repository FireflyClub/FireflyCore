// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class SceneMonsterOuterClass {
  /**
   * Protobuf type {@code SceneMonster}
   */
  public static final class SceneMonster extends ProtoMessage<SceneMonster> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 max_hp = 10;</code>
     */
    private int maxHp;

    /**
     * <code>optional uint32 monster_id = 11;</code>
     */
    private int monsterId;

    /**
     * <code>optional uint32 cur_hp = 14;</code>
     */
    private int curHp;

    private SceneMonster() {
    }

    /**
     * @return a new empty instance of {@code SceneMonster}
     */
    public static SceneMonster newInstance() {
      return new SceneMonster();
    }

    /**
     * <code>optional uint32 max_hp = 10;</code>
     * @return whether the maxHp field is set
     */
    public boolean hasMaxHp() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 max_hp = 10;</code>
     * @return this
     */
    public SceneMonster clearMaxHp() {
      bitField0_ &= ~0x00000001;
      maxHp = 0;
      return this;
    }

    /**
     * <code>optional uint32 max_hp = 10;</code>
     * @return the maxHp
     */
    public int getMaxHp() {
      return maxHp;
    }

    /**
     * <code>optional uint32 max_hp = 10;</code>
     * @param value the maxHp to set
     * @return this
     */
    public SceneMonster setMaxHp(final int value) {
      bitField0_ |= 0x00000001;
      maxHp = value;
      return this;
    }

    /**
     * <code>optional uint32 monster_id = 11;</code>
     * @return whether the monsterId field is set
     */
    public boolean hasMonsterId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 monster_id = 11;</code>
     * @return this
     */
    public SceneMonster clearMonsterId() {
      bitField0_ &= ~0x00000002;
      monsterId = 0;
      return this;
    }

    /**
     * <code>optional uint32 monster_id = 11;</code>
     * @return the monsterId
     */
    public int getMonsterId() {
      return monsterId;
    }

    /**
     * <code>optional uint32 monster_id = 11;</code>
     * @param value the monsterId to set
     * @return this
     */
    public SceneMonster setMonsterId(final int value) {
      bitField0_ |= 0x00000002;
      monsterId = value;
      return this;
    }

    /**
     * <code>optional uint32 cur_hp = 14;</code>
     * @return whether the curHp field is set
     */
    public boolean hasCurHp() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 cur_hp = 14;</code>
     * @return this
     */
    public SceneMonster clearCurHp() {
      bitField0_ &= ~0x00000004;
      curHp = 0;
      return this;
    }

    /**
     * <code>optional uint32 cur_hp = 14;</code>
     * @return the curHp
     */
    public int getCurHp() {
      return curHp;
    }

    /**
     * <code>optional uint32 cur_hp = 14;</code>
     * @param value the curHp to set
     * @return this
     */
    public SceneMonster setCurHp(final int value) {
      bitField0_ |= 0x00000004;
      curHp = value;
      return this;
    }

    @Override
    public SceneMonster copyFrom(final SceneMonster other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        maxHp = other.maxHp;
        monsterId = other.monsterId;
        curHp = other.curHp;
      }
      return this;
    }

    @Override
    public SceneMonster mergeFrom(final SceneMonster other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMaxHp()) {
        setMaxHp(other.maxHp);
      }
      if (other.hasMonsterId()) {
        setMonsterId(other.monsterId);
      }
      if (other.hasCurHp()) {
        setCurHp(other.curHp);
      }
      return this;
    }

    @Override
    public SceneMonster clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      maxHp = 0;
      monsterId = 0;
      curHp = 0;
      return this;
    }

    @Override
    public SceneMonster clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneMonster)) {
        return false;
      }
      SceneMonster other = (SceneMonster) o;
      return bitField0_ == other.bitField0_
        && (!hasMaxHp() || maxHp == other.maxHp)
        && (!hasMonsterId() || monsterId == other.monsterId)
        && (!hasCurHp() || curHp == other.curHp);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(maxHp);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(monsterId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(curHp);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(maxHp);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(monsterId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curHp);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneMonster mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // maxHp
            maxHp = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // monsterId
            monsterId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // curHp
            curHp = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.maxHp, maxHp);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.monsterId, monsterId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.curHp, curHp);
      }
      output.endObject();
    }

    @Override
    public SceneMonster mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 103671180:
          case -1081138749: {
            if (input.isAtField(FieldNames.maxHp)) {
              if (!input.trySkipNullValue()) {
                maxHp = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1316830571:
          case 2127946656: {
            if (input.isAtField(FieldNames.monsterId)) {
              if (!input.trySkipNullValue()) {
                monsterId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 95026024:
          case -1349138585: {
            if (input.isAtField(FieldNames.curHp)) {
              if (!input.trySkipNullValue()) {
                curHp = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public SceneMonster clone() {
      return new SceneMonster().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneMonster parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneMonster(), data).checkInitialized();
    }

    public static SceneMonster parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneMonster(), input).checkInitialized();
    }

    public static SceneMonster parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneMonster(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneMonster messages
     */
    public static MessageFactory<SceneMonster> getFactory() {
      return SceneMonsterFactory.INSTANCE;
    }

    private enum SceneMonsterFactory implements MessageFactory<SceneMonster> {
      INSTANCE;

      @Override
      public SceneMonster create() {
        return SceneMonster.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName maxHp = FieldName.forField("maxHp", "max_hp");

      static final FieldName monsterId = FieldName.forField("monsterId", "monster_id");

      static final FieldName curHp = FieldName.forField("curHp", "cur_hp");
    }
  }
}
