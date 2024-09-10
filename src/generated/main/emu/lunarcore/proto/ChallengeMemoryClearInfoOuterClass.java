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
import us.hebi.quickbuf.RepeatedMessage;

public final class ChallengeMemoryClearInfoOuterClass {
  /**
   * Protobuf type {@code ChallengeMemoryClearInfo}
   */
  public static final class ChallengeMemoryClearInfo extends ProtoMessage<ChallengeMemoryClearInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 level = 7;</code>
     */
    private int level;

    /**
     * <code>optional uint32 round_count = 12;</code>
     */
    private int roundCount;

    /**
     * <code>optional uint32 highest_difficulty = 14;</code>
     */
    private int highestDifficulty;

    /**
     * <code>repeated .ChallengeLineup lineup_list = 11;</code>
     */
    private final RepeatedMessage<ChallengeLineupOuterClass.ChallengeLineup> lineupList = RepeatedMessage.newEmptyInstance(ChallengeLineupOuterClass.ChallengeLineup.getFactory());

    private ChallengeMemoryClearInfo() {
    }

    /**
     * @return a new empty instance of {@code ChallengeMemoryClearInfo}
     */
    public static ChallengeMemoryClearInfo newInstance() {
      return new ChallengeMemoryClearInfo();
    }

    /**
     * <code>optional uint32 level = 7;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 level = 7;</code>
     * @return this
     */
    public ChallengeMemoryClearInfo clearLevel() {
      bitField0_ &= ~0x00000001;
      level = 0;
      return this;
    }

    /**
     * <code>optional uint32 level = 7;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <code>optional uint32 level = 7;</code>
     * @param value the level to set
     * @return this
     */
    public ChallengeMemoryClearInfo setLevel(final int value) {
      bitField0_ |= 0x00000001;
      level = value;
      return this;
    }

    /**
     * <code>optional uint32 round_count = 12;</code>
     * @return whether the roundCount field is set
     */
    public boolean hasRoundCount() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 round_count = 12;</code>
     * @return this
     */
    public ChallengeMemoryClearInfo clearRoundCount() {
      bitField0_ &= ~0x00000002;
      roundCount = 0;
      return this;
    }

    /**
     * <code>optional uint32 round_count = 12;</code>
     * @return the roundCount
     */
    public int getRoundCount() {
      return roundCount;
    }

    /**
     * <code>optional uint32 round_count = 12;</code>
     * @param value the roundCount to set
     * @return this
     */
    public ChallengeMemoryClearInfo setRoundCount(final int value) {
      bitField0_ |= 0x00000002;
      roundCount = value;
      return this;
    }

    /**
     * <code>optional uint32 highest_difficulty = 14;</code>
     * @return whether the highestDifficulty field is set
     */
    public boolean hasHighestDifficulty() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 highest_difficulty = 14;</code>
     * @return this
     */
    public ChallengeMemoryClearInfo clearHighestDifficulty() {
      bitField0_ &= ~0x00000004;
      highestDifficulty = 0;
      return this;
    }

    /**
     * <code>optional uint32 highest_difficulty = 14;</code>
     * @return the highestDifficulty
     */
    public int getHighestDifficulty() {
      return highestDifficulty;
    }

    /**
     * <code>optional uint32 highest_difficulty = 14;</code>
     * @param value the highestDifficulty to set
     * @return this
     */
    public ChallengeMemoryClearInfo setHighestDifficulty(final int value) {
      bitField0_ |= 0x00000004;
      highestDifficulty = value;
      return this;
    }

    /**
     * <code>repeated .ChallengeLineup lineup_list = 11;</code>
     * @return whether the lineupList field is set
     */
    public boolean hasLineupList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated .ChallengeLineup lineup_list = 11;</code>
     * @return this
     */
    public ChallengeMemoryClearInfo clearLineupList() {
      bitField0_ &= ~0x00000008;
      lineupList.clear();
      return this;
    }

    /**
     * <code>repeated .ChallengeLineup lineup_list = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableLineupList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ChallengeLineupOuterClass.ChallengeLineup> getLineupList() {
      return lineupList;
    }

    /**
     * <code>repeated .ChallengeLineup lineup_list = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ChallengeLineupOuterClass.ChallengeLineup> getMutableLineupList() {
      bitField0_ |= 0x00000008;
      return lineupList;
    }

    /**
     * <code>repeated .ChallengeLineup lineup_list = 11;</code>
     * @param value the lineupList to add
     * @return this
     */
    public ChallengeMemoryClearInfo addLineupList(
        final ChallengeLineupOuterClass.ChallengeLineup value) {
      bitField0_ |= 0x00000008;
      lineupList.add(value);
      return this;
    }

    /**
     * <code>repeated .ChallengeLineup lineup_list = 11;</code>
     * @param values the lineupList to add
     * @return this
     */
    public ChallengeMemoryClearInfo addAllLineupList(
        final ChallengeLineupOuterClass.ChallengeLineup... values) {
      bitField0_ |= 0x00000008;
      lineupList.addAll(values);
      return this;
    }

    @Override
    public ChallengeMemoryClearInfo copyFrom(final ChallengeMemoryClearInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        level = other.level;
        roundCount = other.roundCount;
        highestDifficulty = other.highestDifficulty;
        lineupList.copyFrom(other.lineupList);
      }
      return this;
    }

    @Override
    public ChallengeMemoryClearInfo mergeFrom(final ChallengeMemoryClearInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      if (other.hasRoundCount()) {
        setRoundCount(other.roundCount);
      }
      if (other.hasHighestDifficulty()) {
        setHighestDifficulty(other.highestDifficulty);
      }
      if (other.hasLineupList()) {
        getMutableLineupList().addAll(other.lineupList);
      }
      return this;
    }

    @Override
    public ChallengeMemoryClearInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      level = 0;
      roundCount = 0;
      highestDifficulty = 0;
      lineupList.clear();
      return this;
    }

    @Override
    public ChallengeMemoryClearInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      lineupList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChallengeMemoryClearInfo)) {
        return false;
      }
      ChallengeMemoryClearInfo other = (ChallengeMemoryClearInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasLevel() || level == other.level)
        && (!hasRoundCount() || roundCount == other.roundCount)
        && (!hasHighestDifficulty() || highestDifficulty == other.highestDifficulty)
        && (!hasLineupList() || lineupList.equals(other.lineupList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(level);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(roundCount);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(highestDifficulty);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < lineupList.length(); i++) {
          output.writeRawByte((byte) 90);
          output.writeMessageNoTag(lineupList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(roundCount);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(highestDifficulty);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * lineupList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(lineupList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChallengeMemoryClearInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // roundCount
            roundCount = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // highestDifficulty
            highestDifficulty = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // lineupList
            tag = input.readRepeatedMessage(lineupList, tag);
            bitField0_ |= 0x00000008;
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
        output.writeUInt32(FieldNames.level, level);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.roundCount, roundCount);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.highestDifficulty, highestDifficulty);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.lineupList, lineupList);
      }
      output.endObject();
    }

    @Override
    public ChallengeMemoryClearInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 102865796: {
            if (input.isAtField(FieldNames.level)) {
              if (!input.trySkipNullValue()) {
                level = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -171935711:
          case -244677858: {
            if (input.isAtField(FieldNames.roundCount)) {
              if (!input.trySkipNullValue()) {
                roundCount = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 490047359:
          case -1618407882: {
            if (input.isAtField(FieldNames.highestDifficulty)) {
              if (!input.trySkipNullValue()) {
                highestDifficulty = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 781801165:
          case -1516340914: {
            if (input.isAtField(FieldNames.lineupList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(lineupList);
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
    public ChallengeMemoryClearInfo clone() {
      return new ChallengeMemoryClearInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChallengeMemoryClearInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChallengeMemoryClearInfo(), data).checkInitialized();
    }

    public static ChallengeMemoryClearInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeMemoryClearInfo(), input).checkInitialized();
    }

    public static ChallengeMemoryClearInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeMemoryClearInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChallengeMemoryClearInfo messages
     */
    public static MessageFactory<ChallengeMemoryClearInfo> getFactory() {
      return ChallengeMemoryClearInfoFactory.INSTANCE;
    }

    private enum ChallengeMemoryClearInfoFactory implements MessageFactory<ChallengeMemoryClearInfo> {
      INSTANCE;

      @Override
      public ChallengeMemoryClearInfo create() {
        return ChallengeMemoryClearInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName level = FieldName.forField("level");

      static final FieldName roundCount = FieldName.forField("roundCount", "round_count");

      static final FieldName highestDifficulty = FieldName.forField("highestDifficulty", "highest_difficulty");

      static final FieldName lineupList = FieldName.forField("lineupList", "lineup_list");
    }
  }
}
