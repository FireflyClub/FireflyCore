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
import us.hebi.quickbuf.RepeatedInt;

public final class GetRollShopInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetRollShopInfoScRsp}
   */
  public static final class GetRollShopInfoScRsp extends ProtoMessage<GetRollShopInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 gacha_random = 4;</code>
     */
    private int gachaRandom;

    /**
     * <code>optional uint32 roll_shop_id = 9;</code>
     */
    private int rollShopId;

    /**
     * <code>optional uint32 retcode = 10;</code>
     */
    private int retcode;

    /**
     * <code>repeated uint32 OKHEIOJFJKP = 14;</code>
     */
    private final RepeatedInt oKHEIOJFJKP = RepeatedInt.newEmptyInstance();

    private GetRollShopInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetRollShopInfoScRsp}
     */
    public static GetRollShopInfoScRsp newInstance() {
      return new GetRollShopInfoScRsp();
    }

    /**
     * <code>optional uint32 gacha_random = 4;</code>
     * @return whether the gachaRandom field is set
     */
    public boolean hasGachaRandom() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 gacha_random = 4;</code>
     * @return this
     */
    public GetRollShopInfoScRsp clearGachaRandom() {
      bitField0_ &= ~0x00000001;
      gachaRandom = 0;
      return this;
    }

    /**
     * <code>optional uint32 gacha_random = 4;</code>
     * @return the gachaRandom
     */
    public int getGachaRandom() {
      return gachaRandom;
    }

    /**
     * <code>optional uint32 gacha_random = 4;</code>
     * @param value the gachaRandom to set
     * @return this
     */
    public GetRollShopInfoScRsp setGachaRandom(final int value) {
      bitField0_ |= 0x00000001;
      gachaRandom = value;
      return this;
    }

    /**
     * <code>optional uint32 roll_shop_id = 9;</code>
     * @return whether the rollShopId field is set
     */
    public boolean hasRollShopId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 roll_shop_id = 9;</code>
     * @return this
     */
    public GetRollShopInfoScRsp clearRollShopId() {
      bitField0_ &= ~0x00000002;
      rollShopId = 0;
      return this;
    }

    /**
     * <code>optional uint32 roll_shop_id = 9;</code>
     * @return the rollShopId
     */
    public int getRollShopId() {
      return rollShopId;
    }

    /**
     * <code>optional uint32 roll_shop_id = 9;</code>
     * @param value the rollShopId to set
     * @return this
     */
    public GetRollShopInfoScRsp setRollShopId(final int value) {
      bitField0_ |= 0x00000002;
      rollShopId = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return this
     */
    public GetRollShopInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000004;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetRollShopInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000004;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated uint32 OKHEIOJFJKP = 14;</code>
     * @return whether the oKHEIOJFJKP field is set
     */
    public boolean hasOKHEIOJFJKP() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated uint32 OKHEIOJFJKP = 14;</code>
     * @return this
     */
    public GetRollShopInfoScRsp clearOKHEIOJFJKP() {
      bitField0_ &= ~0x00000008;
      oKHEIOJFJKP.clear();
      return this;
    }

    /**
     * <code>repeated uint32 OKHEIOJFJKP = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableOKHEIOJFJKP()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getOKHEIOJFJKP() {
      return oKHEIOJFJKP;
    }

    /**
     * <code>repeated uint32 OKHEIOJFJKP = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableOKHEIOJFJKP() {
      bitField0_ |= 0x00000008;
      return oKHEIOJFJKP;
    }

    /**
     * <code>repeated uint32 OKHEIOJFJKP = 14;</code>
     * @param value the oKHEIOJFJKP to add
     * @return this
     */
    public GetRollShopInfoScRsp addOKHEIOJFJKP(final int value) {
      bitField0_ |= 0x00000008;
      oKHEIOJFJKP.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 OKHEIOJFJKP = 14;</code>
     * @param values the oKHEIOJFJKP to add
     * @return this
     */
    public GetRollShopInfoScRsp addAllOKHEIOJFJKP(final int... values) {
      bitField0_ |= 0x00000008;
      oKHEIOJFJKP.addAll(values);
      return this;
    }

    @Override
    public GetRollShopInfoScRsp copyFrom(final GetRollShopInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        gachaRandom = other.gachaRandom;
        rollShopId = other.rollShopId;
        retcode = other.retcode;
        oKHEIOJFJKP.copyFrom(other.oKHEIOJFJKP);
      }
      return this;
    }

    @Override
    public GetRollShopInfoScRsp mergeFrom(final GetRollShopInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGachaRandom()) {
        setGachaRandom(other.gachaRandom);
      }
      if (other.hasRollShopId()) {
        setRollShopId(other.rollShopId);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasOKHEIOJFJKP()) {
        getMutableOKHEIOJFJKP().addAll(other.oKHEIOJFJKP);
      }
      return this;
    }

    @Override
    public GetRollShopInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      gachaRandom = 0;
      rollShopId = 0;
      retcode = 0;
      oKHEIOJFJKP.clear();
      return this;
    }

    @Override
    public GetRollShopInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      oKHEIOJFJKP.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetRollShopInfoScRsp)) {
        return false;
      }
      GetRollShopInfoScRsp other = (GetRollShopInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasGachaRandom() || gachaRandom == other.gachaRandom)
        && (!hasRollShopId() || rollShopId == other.rollShopId)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasOKHEIOJFJKP() || oKHEIOJFJKP.equals(other.oKHEIOJFJKP));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(gachaRandom);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(rollShopId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < oKHEIOJFJKP.length(); i++) {
          output.writeRawByte((byte) 112);
          output.writeUInt32NoTag(oKHEIOJFJKP.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gachaRandom);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rollShopId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * oKHEIOJFJKP.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(oKHEIOJFJKP);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetRollShopInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // gachaRandom
            gachaRandom = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // rollShopId
            rollShopId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // oKHEIOJFJKP [packed=true]
            input.readPackedUInt32(oKHEIOJFJKP, tag);
            bitField0_ |= 0x00000008;
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
          case 112: {
            // oKHEIOJFJKP [packed=false]
            tag = input.readRepeatedUInt32(oKHEIOJFJKP, tag);
            bitField0_ |= 0x00000008;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.gachaRandom, gachaRandom);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.rollShopId, rollShopId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedUInt32(FieldNames.oKHEIOJFJKP, oKHEIOJFJKP);
      }
      output.endObject();
    }

    @Override
    public GetRollShopInfoScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1635961627:
          case -47579616: {
            if (input.isAtField(FieldNames.gachaRandom)) {
              if (!input.trySkipNullValue()) {
                gachaRandom = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -904898162:
          case -1612413630: {
            if (input.isAtField(FieldNames.rollShopId)) {
              if (!input.trySkipNullValue()) {
                rollShopId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -676259564: {
            if (input.isAtField(FieldNames.oKHEIOJFJKP)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(oKHEIOJFJKP);
                bitField0_ |= 0x00000008;
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
    public GetRollShopInfoScRsp clone() {
      return new GetRollShopInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetRollShopInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetRollShopInfoScRsp(), data).checkInitialized();
    }

    public static GetRollShopInfoScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetRollShopInfoScRsp(), input).checkInitialized();
    }

    public static GetRollShopInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetRollShopInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetRollShopInfoScRsp messages
     */
    public static MessageFactory<GetRollShopInfoScRsp> getFactory() {
      return GetRollShopInfoScRspFactory.INSTANCE;
    }

    private enum GetRollShopInfoScRspFactory implements MessageFactory<GetRollShopInfoScRsp> {
      INSTANCE;

      @Override
      public GetRollShopInfoScRsp create() {
        return GetRollShopInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName gachaRandom = FieldName.forField("gachaRandom", "gacha_random");

      static final FieldName rollShopId = FieldName.forField("rollShopId", "roll_shop_id");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName oKHEIOJFJKP = FieldName.forField("OKHEIOJFJKP");
    }
  }
}
